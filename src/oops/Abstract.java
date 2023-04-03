package oops;
abstract class car
{													
	abstract public void speedlimit();
	abstract public void airbag();
	
}
class maruthi extends car
{

	@Override
	public void speedlimit() {
		System.out.println("maruthi speedlimit 80");
		
	}

	@Override
	public void airbag() {
		System.out.println("maruthi has 1 airbags");
		
	}
	
}
class kia extends car
{

	@Override
	public void speedlimit() {
		System.out.println("kia speedlimit 200");
		
	}

	@Override
	public void airbag() {
		System.out.println("kia has 7 airbags");
		
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		maruthi m=new maruthi();
		m.speedlimit();
		m.airbag();
		kia k=new kia();
		k.speedlimit();
		k.airbag();
		
	}

}
