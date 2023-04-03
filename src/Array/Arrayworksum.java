package Array;

import java.util.Scanner;

public class Arrayworksum {

	public static void main(String[] args) {
		Scanner jc=new Scanner(System.in);
		int[]a= new int[2];
		int sum=0;
		System.out.println("Enter numbers");
		for(int i=0;i<=1;i++)
		{
			a[i]=jc.nextInt();
		}
		for(int i=0;i<=1;i++)
		{
			sum=sum+a[i];
		}
		{
				System.out.println("sum is"+sum);
		}
	
		
		
		

	}

}
