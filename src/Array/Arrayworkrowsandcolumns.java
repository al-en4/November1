package Array;

import java.util.Scanner;

public class Arrayworkrowsandcolumns {

	public static void main(String[] args) {
		int [][]ar=new int[3][2];
		Scanner yc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				ar[i][j]=yc.nextInt();
			}

	}
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	
			
		}
		


