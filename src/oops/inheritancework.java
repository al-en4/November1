package oops;
class member
{
	String name;
	int age;
	int phoneno;
	String address;
	int salary;
	

public void display()
{
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("address="+address);
	System.out.println("salary="+salary);
}
}
class Employer1 extends member
{
	String specialization;
	
	
}
class Manager extends member
{
	String department;
	
}

public class inheritancework {

	public static void main(String[] args) {
		Employer1 b1=new Employer1();
		b1.name="pravi";
		b1.age=25;
		b1.phoneno=812345678;
		b1.salary=250000;                  
		b1.address="abc";
		System.out.println(b1.specialization="devoloper");
		b1.display();
	Manager b2=new Manager();
	b2.name="kkk";
	b2.age=30;
	b2.phoneno=587945621;
	b2.salary=280000;
	b2.address="abcds";
	b2.display();
	}
		

}
