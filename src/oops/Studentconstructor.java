package oops;

public class Studentconstructor {
	int stid;
	String stname;
	String department;
	public Studentconstructor (int stid,String stname,String department)
	{
		this.stid=stid;
		this.stname=stname;
		this.department=department;
	}
	public void display()
	{
		System.out.println("stid="+stid);
		System.out.println("stname="+stname);
		System.out.println("department="+department);
	}
	
	public static void main(String[] args) {
		Studentconstructor st1=new Studentconstructor(101,"alen","bcom");
		st1.display();
		Studentconstructor st2=new Studentconstructor(102,"sarath","mtec");
		st2.display();
		
		
	}

}
