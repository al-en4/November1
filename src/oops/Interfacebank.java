package oops;

import java.util.Scanner;

interface bank
{
	public void accountdetails();
	public void deposite();
	public void withdraw();
}
class axis implements bank
{
	int balance=20000;

	Scanner s=new Scanner(System.in);
	@Override
	public void accountdetails() {
		System.out.println("enter your name");
		String name=s.next();
		System.out.println("enter your account number");
		int number=s.nextInt();
		System.out.println("balance="+balance);
		
		
	}

	@Override
	public void deposite() {
		System.out.println("enter your deposite amount");
		int deposite=s.nextInt();
		balance=balance+deposite;
		System.out.println("balance="+balance);
	}

	@Override
	public void withdraw() {
		System.out.println("enter your withdrawl amount");
		int withdraw=s.nextInt();
		balance=balance-withdraw;
		System.out.println("balance="+balance);
		
		
	}
	
}

public class Interfacebank {

	public static void main(String[] args) {
		axis s=new axis();
		s.accountdetails();
		s.deposite();
		s.withdraw();
		

	}

}
