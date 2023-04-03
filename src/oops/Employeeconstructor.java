package oops;

public class Employeeconstructor {
	int empid;
	String empname;
	String designation;
	public Employeeconstructor(int empid,String empname,String designation)
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
		Employeeconstructor emp1=new Employeeconstructor(101,"alen","tester");
		emp1.display();
		Employeeconstructor emp2=new Employeeconstructor(102,"allen","tester");
		emp2.display();
		

	}

}
