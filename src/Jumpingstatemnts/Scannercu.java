package Jumpingstatemnts;

import java.util.Scanner;

public class Scannercu {

	public static void main(String[] args) {
		System.out.println("enter two numbers");
		Scanner ac=new Scanner(System.in);
		int a=ac.nextInt();
		int b=ac.nextInt();
		System.out.println("enter operator");
		char op=ac.next().charAt(0);
		switch(op)
		{
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		default:System.out.println("invalid");
	
		}
	}
}
