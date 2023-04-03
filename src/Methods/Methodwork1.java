package Methods;

public class Methodwork1 {

	public static void main(String[] args) {
	Methodwork1 nc=new Methodwork1();
	double a=nc.circleArea();
	System.out.println("area of circle="+a);
	double b=nc.triangle(300,500);
	System.out.println("area of triangle="+b);
	nc.square();
	}
public double circleArea() // with return type & without parameters
{
	double pi=3.14,r=30;
	double ans=pi*r*r;
	return ans;
}
public double triangle(int b,int h)	//with return type with parameters
{
	double tri=0.5*b*h;
	return tri;
}
public void square(int b,int h)
{
	int a=20;
	int value=a*a;
	System.out.println("area of square"+value);
}

}


