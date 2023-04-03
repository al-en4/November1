package oops;
class sbi
{
	int fd=50000;
	public void interest()
	{
		System.out.println("Interest rate of sbi is 8%");
	}
	public void minimumbalance()
	{
		
		System.out.println("minimum balance is 1000");
	}
}

class hdfc extends sbi
	{	
		@Override
		public void interest() {
			System.out.println(super.fd);
			System.out.println("interest rate of hdfc is 9%");
			super.interest();
		}
		
	}

public class Methodbyoveride2 {

	public static void main(String[] args) {
		hdfc h=new hdfc();
		h.interest();
		
		
	}

}
