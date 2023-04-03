package string;

public class Stringpgm {

	public static void main(String[] args) {
		String s1="hello welcome";
		String s2="		Hello	";
		String s3=new String("hello");
		// comparison
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1==s3);
		
		//concat
		System.out.println(s1.concat(s2));
		System.out.println(1+2+"hello"+6+7);
		
		//length
		System.out.println(s1.length());
		
		//startswith & endswith
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("h"));
		
		//to uppercase
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//charAT
		System.out.println(s2.charAt(2));
		
		//trim
		
		System.out.println(s2.trim());
		
		//contains
		System.out.println(s1.contains("welcome"));
		
		//substring
		System.out.println(s1.substring(2,5));
		
		//split
		String a="hello welcome to luminar";
		String ar[]=a.split(" ");
		for(String v:ar)
		{
			System.out.println(v);
		}
		}
		
	}

