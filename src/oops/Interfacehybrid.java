package oops;
interface fourwheel
{
	public void speedlimit();
}
class  audi implements fourwheel
{

	@Override
	public void speedlimit() {
		System.out.println("Speedlimit of audi");
		
	}
	
}
class bmw implements  fourwheel
{

	@Override
	public void speedlimit() {
		System.out.println("Speedlimit of bmw");
		
		
	}
	
}
public class Interfacehybrid {

	public static void main(String[] args) {
		fourwheel ob=new audi();
		ob.speedlimit();
		ob=new bmw();
		ob.speedlimit();

	}

}
