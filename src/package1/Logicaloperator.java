package package1;

public class Logicaloperator {

	public static void main(String[] args) {
		//logical operators(&&,||,!)
		String username="abc";
		String pswd="abc123";
		System.out.println(username=="abc" && pswd=="abc123");//true
		System.out.println(username=="abc1" || pswd=="abc123");//true
		
		System.out.println(!(username=="ab"));
		
	}

}
