package Methods;

import java.util.Scanner;

public class Methodvowels {

	public static void main(String[] args) {
		Methodvowels v=new Methodvowels();
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		v.vowelsCount(s);
		

	}
	public void vowelsCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
}
