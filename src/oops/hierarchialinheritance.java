package oops;
class shebin
{
	public void eat()
	{
		System.out.println("eating");
		
	}
}
class father extends shebin
{
	public void joy()
	{
		System.out.println("shebin's father");
		
	}
}
class grandson extends shebin
{
	public void babu()
	{
		System.out.println("shebin's son");
		
	}
}
public class hierarchialinheritance {

	public static void main(String[] args) {
	father s=new father();
	s.eat();
	s.joy();
	grandson g=new grandson();
	g.eat();
	g.babu();

	}

}
