package string;

public class Stringpg1 {

	public static void main(String[] args) {
		String s="java";
		String s1="language";
		System.out.println(s.concat(s1));
		String s3="java is platform independent language";
		
		System.out.println(s3.contains("platform"));
		String ar[]=s3.split(" ");
		for(String v:ar)
		{
			System.out.println(v);
			if(v.equals("independent"))
			{
				break;
			}
			
			
		}
		
	}

}
