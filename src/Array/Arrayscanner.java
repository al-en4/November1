package Array;

import java.util.Scanner;

public class Arrayscanner {

	public static void main(String[] args) {
		Scanner nc=new Scanner(System.in);
		int[] a=new int[3];
		System.out.println("Enter numbers");
		for(int i=0;i<=2;i++)
		{
			a[i]=nc.nextInt();	
		}
		for(int i=0;i<=2;i++)
		{
			System.out.println("values="+a[i]);
		}
	}
}
		
	
	

