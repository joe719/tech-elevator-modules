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
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;

	public class JDBCEmployeeDAOTest {
		
		
		private JdbcTemplate jdbcTemplate;
		private static SingleConnectionDataSource dataSource;
		private JDBCEmployeeDAO dao;
		
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
			String sqlInsertProject = "INSERT INTO employee(employee_id, department_id, first_name, last_name, birth_date, gender, hire_date) VALUES (12, 4, 'Bill', 'Hendrix', '1970-09-12', 'M', '1968-6-23')";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.update(sqlInsertProject);
			dao = new JDBCEmployeeDAO(dataSource);
		}
		
		@After
		public void rollback() throws SQLException {
			dataSource.getConnection().rollback();			
		}
		
//		@Test
//		public void get_all_employees_gets_1_employee() {
//			List<Employee> employees = dao.getAllEmployees();
//			int originalSize = employees.size();
//			insertEmployee(insertDepartment("Test Department"), 3L, "Lars", "Meandor", LocalDate.of(1940, 7, 10), 'M', LocalDate.of(1956, 4, 2));
//			employees = dao.getAllEmployees();
//			Assert.assertEquals(originalSize + 1, employees.size());
//		}
//		
//		private int insertDepartment(String name) {
//			String departmentSql = "INSERT INTO department (department_id, name) " +
//								   "VALUES (DEFAULT, ?) RETURNING department_id";
//			SqlRowSet results = jdbcTemplate.queryForRowSet(departmentSql, name);
//			results.next();
//			return results.getInt(1);
//		}
//		
//		private int insertEmployee(int departmentId, String firstName, String lastName, LocalDate birthDate, char gender, LocalDate hireDate) {
//			String employeeSql = "INSERT INTO employee (employee_id, department_id, first_name, last_name, birth_date, gender, hire_date) " +
//								 "VALUES (DEFAULT, ?, ?, ?, '" + birthDate + "', ?, '" + hireDate + "') RETURNING employee_id";
//			SqlRowSet results = jdbcTemplate.queryForRowSet(employeeSql, departmentId, firstName, lastName, gender);
//			results.next();
//			return results.getInt(1);
//		}
		
		@Test
		public void returns_employees_by_name() {

			Employee theEmployee = getEmployee( 4L, "Bill", "Hendrix", LocalDate.of(1970, 9, 12), 'M', LocalDate.of(1971, 8, 24));

			dao.saveEmployee(theEmployee);
			List<Employee> results = dao.searchEmployeesByName("Bill", "Hendrix");

			assertNotNull(results);
			assertEquals(1, results.size());
			Employee savedEmployee = results.get(0);
			assertEmployeesAreEqual(theEmployee, savedEmployee);
		}
		
		@Test
		public void returns_employees_with_no_projects() {

			Employee theEmployee = getEmployee( 4L, "Ron", "Nazer", LocalDate.of(1989, 4, 2), 'M', LocalDate.of(1967, 9, 4));

			dao.saveEmployee(theEmployee);
			List<Employee> results = dao.getEmployeesWithoutProjects();

			assertNotNull(results);
			assertEquals(1, results.size());
			Employee savedEmployee = results.get(0);
			assertEmployeesAreEqual(theEmployee, savedEmployee);
		}
		
		private Employee getEmployee(Long departmentId, String firstName, String lastName, LocalDate birthDay, char gender, LocalDate hireDate) {
			Employee theEmployee = new Employee();
			//theEmployee.setId(employeeId);
			theEmployee.setDepartmentId(departmentId);
			theEmployee.setFirstName(firstName);
			theEmployee.setLastName(lastName);
			theEmployee.setBirthDay(birthDay);
			theEmployee.setGender(gender);
			theEmployee.setHireDate(hireDate);
			return theEmployee;
		}

		private void assertEmployeesAreEqual(Employee expected, Employee actual) {
			//assertEquals(expected.getId(), actual.getId());
			assertEquals(expected.getDepartmentId(), actual.getDepartmentId());
			assertEquals(expected.getFirstName(), actual.getFirstName());
			assertEquals(expected.getLastName(), actual.getLastName());
			assertEquals(expected.getBirthDay(), actual.getBirthDay());
			assertEquals(expected.getGender(), actual.getGender());
			assertEquals(expected.getHireDate(), actual.getHireDate());
		}
		
		
}
