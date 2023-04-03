package oops;
class animal
{
	public void eat()
	{
		System.out.println("animal eat");
		
	}
	
}
class cat extends animal
{
	public void meow()
	{
		System.out.println("meow");
		
	}
}
class babycat extends cat
{
	public void babycat()
	{
		System.out.println("babycat");
	}
	
	}

public class Multilevelinheritance {

	public static void main(String[] args) {
		babycat d=new babycat();
		d.eat();
		d.meow();
		d.babycat();

	}

}
