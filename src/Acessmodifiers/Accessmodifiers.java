package Acessmodifiers;
class parent
{
	protected int a=10;
	
}

public class Accessmodifiers {
	protected int c=50;
	public static void main(String[] args) {
		parent p=new parent();
		System.out.println(p.a);

	}

}
