package oops;
interface phonedetails
{
	public void companyname();
	public void modelname();
}
class phonedetails1 implements phonedetails
{

	@Override
	public void companyname() {
		System.out.println("nokia");
		
	}

	@Override
	public void modelname() {
		System.out.println("lumia");
		
	}
}
class phonedetails2 implements phonedetails
{

	@Override
	public void companyname() {
		System.out.println("samsung");
		
	}

	@Override
	public void modelname() {
		System.out.println("galaxy");
		
	}
	
}
public class Abstractinterface {

	public static void main(String[] args) {
		phonedetails1 p=new phonedetails1();
		p.companyname();
		p.modelname();
		 phonedetails2 p2=new phonedetails2();
		 p2.companyname();
		 p2.modelname();
	}

}
