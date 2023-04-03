package Methods;

public class Methodtypes {

	public static void main(String[] args) {
	Methodtypes ac=new Methodtypes();
	ac.add();
	ac.sub(30,20);
	ac.mul();
	int nc=ac.mul();
	System.out.println("multipication="+nc);
	double diva=ac.div(10,2);
	System.out.println(diva);
	
	
	}
	
	
	//without return type & without parameters
	
public void add()
{
	int a=10,b=20;
	int sum=a+b;
	System.out.println(sum);

}

//method without returntype & with parameters

public void sub(int a,int b)
{
	int sub=a-b;
	System.out.println(sub);
}

// method with return type & without parameters
public int mul()
{
	int a=10,b=30;
	int ans=a*b;
	return ans;
}

// Method with return type & with parameters
public double div(int a,int b)
{
double divison=a/b;
return divison;
}


}