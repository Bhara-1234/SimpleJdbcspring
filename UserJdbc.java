package example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class UserJdbc implements UserContractor {
	

	@Override
	public HashMap<String, String> userdata() {
		
		HashMap<String,String> hs=new HashMap<>();
      try {
    	  
    	  Class.forName("org.postgresql.Driver");
    	 
    	  Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?user=postgres&password=Bhara@1234");
     
          Statement st = con.createStatement();
          
          ResultSet rs=st.executeQuery("select * from users");
          while(rs.next()) {
        	  hs.put(rs.getString(1), rs.getString(2));
        	  
          }
    
      
      }
      
      catch(Exception e) {
    	  e.printStackTrace();
      }
	return hs;
	
	}
	public boolean available(String username,String password) {
		HashMap<String, String> hs= userdata();
		if(hs.containsKey(username)&&hs.get(username).equals(password)) {
			return true;
		}
	
		return false;
	}
	
    
}
