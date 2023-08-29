package example;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp= new Employee();
		emp.setEmpno(rs.getString(1));
		emp.setEmpname(rs.getString(2));
		emp.setJob(rs.getString(3));
		emp.setSal(rs.getString(4));
		emp.setDept(rs.getString(5));
		
		return emp;
	}
	

}
