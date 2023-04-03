package oops;

public class Employeewithobject {
	int empid;
	String empname;
	String designation;
	public void display()
	{
		System.out.println("empid="+empid);
		System.out.println("empname="+empname);
		System.out.println("designation="+designation);
	}
	

	public static void main(String[] args) {
		Employeewithobject emp1=new Employeewithobject();
		emp1.empid=101;
		emp1.empname="alen";
		emp1.designation="tester";
		emp1.display();
	Employeewithobject emp2=new Employeewithobject();
	emp2.empid=102;
	emp2.empname="arun";
	emp2.designation="designer";
	emp2.display();
		
		

	}

}
