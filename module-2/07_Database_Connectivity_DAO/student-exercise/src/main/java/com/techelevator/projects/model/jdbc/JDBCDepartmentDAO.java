package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

//import com.techelevator.city.City;
import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;
import com.techelevator.projects.model.Employee;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> results = new ArrayList<>();
		String sql = "SELECT department_id, name FROM department";
		SqlRowSet departments = jdbcTemplate.queryForRowSet(sql);
		
		while(departments.next()) {
			Long deptId = departments.getLong("department_id");
			String deptName = departments.getString("name");
			
			Department thisDept = new Department();
			thisDept.setId(deptId);
			thisDept.setName(deptName);
			
			results.add(thisDept);
		}
		return results;	
		}
	

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		ArrayList<Department> departments = new ArrayList<>();
		String sqlFindDeptByName = "SELECT department_id, name "+
										   "FROM department "+
										   "WHERE name = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindDeptByName, nameSearch);
		while(results.next()) {
			Department theDepartment = mapRowToDepartment(results);
			departments.add(theDepartment);
		}
		return departments;
	}

	

	@Override
	public void saveDepartment(Department updatedDepartment) {
		String sqlInsertDept = "UPDATE department(department_id, name) " +
				   "VALUES(?, ?)";
		updatedDepartment.setId(getNextDeptId());
		jdbcTemplate.update(sqlInsertDept,
							  updatedDepartment.getId(),
							  updatedDepartment.getName());
							  
}
	

	@Override
	public Department createDepartment(Department newDepartment) {
			String sql = "INSERT INTO department (name) VALUES (?)";
			jdbcTemplate.update(sql, newDepartment);
			return newDepartment;
		}
	

	@Override
	public Department getDepartmentById(Long id) {
		Department theDept = null;
		String sqlFindDeptById = "SELECT department_id, name "+
							   "FROM department "+
							   "WHERE department_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindDeptById, id);
		if(results.next()) {
			theDept = mapRowToDepartment(results);
		}
		return theDept;
	}
	
	private Department mapRowToDepartment(SqlRowSet results) {
		Department theDepartment;
		theDepartment = new Department();
		theDepartment.setId(results.getLong("department_id"));
		theDepartment.setName(results.getString("name"));
		return theDepartment;
	}
	private long getNextDeptId() {
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('seq_department_id')");
		if(nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new department");
		}
	}

	
	
}
