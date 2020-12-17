package com.techelevator.projects.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;


import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;

//import com.techelevator.department.JDBCDepartmentDAO;


public class JDBCDepartmentDAOTest {
	
	

	private static SingleConnectionDataSource dataSource;
	private JDBCDepartmentDAO dao;
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/projects");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");

		dataSource.setAutoCommit(false);
	}
	
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}

	@Before
	public void setup() {
		String sqlInsertProject = "INSERT INTO department(department_id, name) VALUES (5, 'IT')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertProject);
		dao = new JDBCDepartmentDAO(dataSource);
	}
	
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	


	@Test
	public void find_department_by_id() throws SQLException {
		Department theDepartment = getDepartment(3L, "Research and Development");

		//dao.saveDepartment(theDepartment);
		Department savedDepartment = dao.getDepartmentById(theDepartment.getId());

		assertNotEquals(null, theDepartment.getId());
		assertDepartmentsAreEqual(theDepartment, savedDepartment);
	}
	
	@Test
	public void returns_departments_by_name() {

		Department theDepartment = getDepartment(5L, "IT");

		dao.saveDepartment(theDepartment);
		List<Department> results = dao.searchDepartmentsByName("IT");

		assertNotNull(results);
		assertEquals(1, results.size());
		Department savedDepartment = results.get(0);
		assertDepartmentsAreEqual(theDepartment, savedDepartment);
	}
	
	private Department getDepartment(Long id, String name) {
		Department theDepartment = new Department();
		theDepartment.setId(id);
		theDepartment.setName(name);
		return theDepartment;
	}

	private void assertDepartmentsAreEqual(Department expected, Department actual) {
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getName(), actual.getName());

	}
}
