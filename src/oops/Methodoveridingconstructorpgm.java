package oops;
class RBI
{
	int a;
	int b;
	
	public RBI(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(+a+" "+b);
	}
}
class FDR extends RBI
{
	public FDR()
	{
		super(10,20);
	}
	
}
public class Methodoveridingconstructorpgm {

	public static void main(String[] args) {
		FDR i=new FDR();
		
	}


}
