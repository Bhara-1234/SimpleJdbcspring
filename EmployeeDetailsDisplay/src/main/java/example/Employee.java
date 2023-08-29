package example;

public class Employee {
 public Employee() {
		
	}
public Employee(String empno, String empname, String job, String sal, String dept) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.job = job;
		this.sal = sal;
		this.dept = dept;
	}
public String getEmpno() {
		return empno;
	}
	public String getEmpname() {
		return empname;
	}
	public String getJob() {
		return job;
	}
	public String getSal() {
		return sal;
	}
	public String getDept() {
		return dept;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
String empno;
 String empname;
 String job;
 String sal;
 String dept;
}
