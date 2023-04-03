package oops;
interface tvremote
{
	public void volumeup();
	public void volumedown();
}
interface smarttv extends tvremote
{
	public void wifi();
	public void bluetooth();
}
class tv implements smarttv
{

	@Override
	public void volumeup() {
		System.out.println("+");
		
	}

	@Override
	public void volumedown() {
		System.out.println("-");
		
	}

	@Override
	public void wifi() {
		System.out.println("wifi5");
		
	}

	@Override
	public void bluetooth() {
		System.out.println("bluetooth6");

		
	}
	
}

	

public class Interfacework2 {

	public static void main(String[] args) {
		tv v=new tv();
		v.volumeup();
		v.volumedown();
		v.bluetooth();
		v.wifi();
	}

}
