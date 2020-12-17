package com.techelevator.projects.model.jdbc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;


import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> results = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date FROM employee";
		SqlRowSet employees = jdbcTemplate.queryForRowSet(sql);
		
		while(employees.next()) {
			Long employeeId = employees.getLong("employee_id");
			Long deptId = employees.getLong("department_id");
			String firstName = employees.getString("first_name");
			String lastName = employees.getString("last_name");
			LocalDate birthDate = employees.getDate("birth_date").toLocalDate();
			char gender = employees.getString("gender").charAt(0);
			LocalDate hireDate = employees.getDate("hire_date").toLocalDate();
			
			Employee thisEmployee = new Employee();
			thisEmployee.setId(employeeId);
			thisEmployee.setDepartmentId(deptId);
			thisEmployee.setFirstName(firstName);
			thisEmployee.setLastName(lastName);
			thisEmployee.setBirthDay(birthDate);
			thisEmployee.setGender(gender);
			thisEmployee.setHireDate(hireDate);
			
			results.add(thisEmployee);
		}
		return results;	
		}
	

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
	
		ArrayList<Employee> employees = new ArrayList<>();
		String sqlFindEmployeeByDeptId = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date "+
										   "FROM employee "+
										   "WHERE first_name = ? AND last_name = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindEmployeeByDeptId, firstNameSearch, lastNameSearch);
		while(results.next()) {
			Employee theEmployee = mapRowToEmployee(results);
			employees.add(theEmployee);
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
			ArrayList<Employee> employees = new ArrayList<>();
			String sqlFindEmployeeByDeptId = "SELECT employee_id, department_id, first_name, last_name, birth_date, gender, hire_date "+
											   "FROM employee "+
											   "WHERE department_id = ?";
			SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindEmployeeByDeptId, id);
			while(results.next()) {
				Employee theEmployee = mapRowToEmployee(results);
				employees.add(theEmployee);
			}
			return employees;
		}

	

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		ArrayList<Employee> employeesNoProject = new ArrayList<>();
		String sqlNoProjectEmployees = "SELECT * FROM employee WHERE employee_id NOT IN (SELECT employee_id FROM project_employee)";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlNoProjectEmployees);
		while(results.next()) {
			Employee theEmployee = mapRowToEmployee(results);
			employeesNoProject.add(theEmployee);
		}
		return employeesNoProject;
	}
	

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		List<Employee> output = new ArrayList<>();
		String sql = "SELECT first_name, last_name, FROM employee JOIN project_employee USING(employee_id) JOIN project USING(project_id)";
				
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		
		while(results.next()) {
			Employee e = new Employee();
			e.setFirstName(results.getString("frist_name"));
			e.setLastName(results.getString("last_name"));
			
			output.add(e);
			
		}
		return output;
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		String sqlChangeEmployeeDepartment = "UPDATE employee SET department_id = ? " +
				 "WHERE employee_id = ?";

jdbcTemplate.update(sqlChangeEmployeeDepartment, departmentId, employeeId);
}


			//String sql = "UPDATE employee set employee_id = ?, department_id = ? WHERE department_id = ?";
			//jdbcTemplate.update(sql, employeeId.getId(), employeeId.getDepartmentId(), employeeId.getFirstName(), employeeId.getLastName(), employeeId.getBirthday(), employeeId.getGender(), employeeId.getHireDate());
	//}

	private Employee mapRowToEmployee(SqlRowSet results) {
		Employee theEmployee;
		theEmployee = new Employee();
		theEmployee.setId(results.getLong("employee_id"));
		theEmployee.setDepartmentId(results.getLong("department_id"));
		theEmployee.setFirstName(results.getString("first_name"));
		theEmployee.setLastName(results.getString("last_name"));
		theEmployee.setBirthDay(results.getDate("birth_date").toLocalDate());
		theEmployee.setGender(results.getString("gender").charAt(0));
		theEmployee.setHireDate(results.getDate("hire_date").toLocalDate());
		return theEmployee;
	}

	public void saveEmployee(Employee theEmployee) {
		// TODO Auto-generated method stub
		
	}
}
