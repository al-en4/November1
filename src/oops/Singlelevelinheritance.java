package oops;
	class Animal
	{
		public void eat()
		{
			System.out.println("animaleat");
		}
	}
	class dog extends Animal
	{
		public void bark()
		{
			System.out.println("bark");
		}
	}
	public class Singlelevelinheritance {
	public static void main(String[] args) {
		dog d=new dog();
		d.eat();
		d.bark();
		

	}

}
