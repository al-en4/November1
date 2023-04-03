package oops;

public class Methodbyoverloading {

	public static void main(String[] args) {
		Methodbyoverloading a=new Methodbyoverloading();
		a.add();
		a.add(50,50);
		a.add(70, 300);
		a.add(500,50);
	}
public void add()
{
	int a=10,b=50;
	int s=a+b;
	System.out.println("sum="+s);
}
public void add(int a,int b)
{
	int s=a+b;
	System.out.println("sum="+s);
}
public void add(int a,double b)
{
	double s=a+b;
	System.out.println("sum"+s);
}
public void add(double b,int a)
{
	double s=a+b;
	System.out.println("sum="+s);
}
}
