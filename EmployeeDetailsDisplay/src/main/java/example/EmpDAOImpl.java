package example;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl implements EmployeeDAO{
	JdbcTemplate jdbctemplate;
	@Autowired
	public EmpDAOImpl(DataSource dataSource) {
		this.jdbctemplate=new JdbcTemplate(dataSource);
	}
	String GET_ALL_EMPLOYEES="select * from B_emp";

	@Override
	public List<Employee> getDetails() {
		 return jdbctemplate.query( GET_ALL_EMPLOYEES,new EmployeeMapper());
	}

}
