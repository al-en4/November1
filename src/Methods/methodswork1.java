package Methods;

import java.util.Scanner;

public class methodswork1 {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner ac=new Scanner(System.in);
		methodswork1 wc=new methodswork1();
		wc.avg();
		
		

	}

	public void avg()
	{
		int a=10,b=20,c=30;
		int avg=(a+b+c)/3;
		System.out.println("average="+avg);
	}
	
	}

