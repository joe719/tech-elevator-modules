package com.techelevator.projects.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
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
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;
import com.techelevator.projects.model.jdbc.JDBCProjectDAO;


public class JDBCProjectDAOTest {

	private JdbcTemplate jdbcTemplate;
	private static SingleConnectionDataSource dataSource;
	private JDBCProjectDAO dao;
	
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
		String sqlInsertProject = "INSERT INTO project(project_id, name, from_date, to_date) VALUES (7, 'M16', '1987-12-10', '1993-10-12')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertProject);
		dao = new JDBCProjectDAO(dataSource);
	}
	
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();			
	}
	
	private int insertProject(String name, String fromDate, String toDate) {
		String projectSql = "INSERT INTO project (project_id, name, from_date, to_date) " +
				"VALUES (DEFAULT, ?, '" + fromDate + "', '" + toDate + "') RETURNING project_id";
		SqlRowSet results = jdbcTemplate.queryForRowSet(projectSql, name);
		results.next();
		return results.getInt(1);
	}
	
	private Project getProject(Long projectId, String name, LocalDate fromDate, LocalDate toDate) {
		Project theProject = new Project();
		theProject.setId(projectId);
		theProject.setName(name);
		theProject.setStartDate(fromDate);
		theProject.setEndDate(toDate);
		return theProject;
	}

	private void assertEmployeesAreEqual(Project expected, Project actual) {
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getName(), actual.getName());
		assertEquals(expected.getStartDate(), actual.getStartDate());
		assertEquals(expected.getEndDate(), actual.getEndDate());
	}
	
}
