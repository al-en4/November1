package oops;
interface basicanimal
{
	public void cat();
	public void jump();
	
}
class monkey
{
	public void jump()
	{
		System.out.println("jump");
	}
	public void bite()
	{
		System.out.println("bite");
	}
}
class humans extends monkey implements basicanimal
{
	public void speak()
	{
		System.out.println("spaek");
	}
	@Override
	public void cat() {
		System.out.println("speaking");	
	}
	
}
	

public class Interfacework {
	

	public static void main(String[] args) {
		humans h=new humans();
		h.cat();
		h.bite();
		h.speak();
		h.jump();

	}

}
