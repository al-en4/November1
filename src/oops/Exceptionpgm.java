package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream f=new FileInputStream("E:book1.x1sx");
		
		
		
		try
		{
			int c=30/0;
		}
		catch(Exception a)
		{
			System.out.println("airthemetic");
			System.out.println(a.getMessage());
		}
		 System.out.println("hai");
	
	try
	{
		String s=null;
		System.out.println(s.length());
		
	}
	catch(Exception a)
	{
		System.out.println("nullpointexception");
	}
	}
}


