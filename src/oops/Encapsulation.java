package oops;
class encap
{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		encap ob=new encap();
		ob.setEmpid(100);
		ob.setEmpname("alen");
		System.out.println(ob.getEmpid());
		System.out.println(ob.getEmpname());
	}

}
