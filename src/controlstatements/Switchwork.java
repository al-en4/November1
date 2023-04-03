package controlstatements;

public class Switchwork {

	public static void main(String[] args) {
		int a=10,b=50;
		char op='/';
		switch(op)
		{
		case '+':System.out.println("a+b="+(a+b));
		break;
		case '-':System.out.println("a-b="+(a-b));
		break;
		case '*':System.out.println("a*b="+(a*b));
		break;
		case '/':if(b==0)
		{
			System.out.println("not divisible by 0");
		}
		else {
			System.out.println("a/b="+(a/b));
		}
			break;
		default:System.out.println("invalid");
		
	}

}
}