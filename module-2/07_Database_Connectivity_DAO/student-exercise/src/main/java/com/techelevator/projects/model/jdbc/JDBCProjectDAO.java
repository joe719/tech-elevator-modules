package com.techelevator.projects.model.jdbc;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Project> getAllActiveProjects() {
		List<Project> activeProjects = new ArrayList<>();
		String sql = "SELECT project_id, name, from_date, to_date " +
					"FROM project " + 
					"WHERE (NOW() BETWEEN from_date AND to_date) OR " +
					" (NOW() > from_date AND to_date IS NULL) OR " +
					" (NOW() < to_date AND from_date IS NULL)";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			Project newProj = new Project();
			newProj.setId(results.getLong(1));
			newProj.setName(results.getString(2));
			
			LocalDate start = results.getDate(3) == null ? null : results.getDate(3).toLocalDate();
			newProj.setStartDate(start);
			
			LocalDate end = results.getDate(4) == null ? null : results.getDate(4).toLocalDate();
			newProj.setStartDate(start);
			
		}
		return activeProjects;	
		}
	

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String sql = "DELETE FROM project_employee WHERE project_id = ? AND employee_id = ?";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String sql = "INSERT INTO project_employee (project_id, employee_id) VALUES (?, ?)";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

}
