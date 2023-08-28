
package example;

public class User {
	String uname;
	String password;
    public User() {
		
	}
	public User(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUname() {
		return uname;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", password=" + password + "]";
	}
	
}
