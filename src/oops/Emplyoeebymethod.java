package oops;

public class Emplyoeebymethod {
	int empid;
	String empname;
	String designation;
	public void setvalue(int empid,String empname,String designation)
	{
		this.empid=empid;
		this.empname=empname;
		this.designation=designation;
		
	}
	public void display()
	{
		System.out.println("empid="+empid);
		System.out.println("empname="+empname);
		System.out.println("designation="+designation);
	}
	public static void main(String[] args) {
		Emplyoeebymethod emp1=new Emplyoeebymethod();
		emp1.setvalue(101,"alen","tester");
		emp1.display();
	}

}
