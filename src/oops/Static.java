package oops;

public class Static {
	
	static String name="alen";
	final double pi=3.14;
		static final String clgname="luminar";
	
			public static void main(String[] args) {
				System.out.println(name);
				//static : without object we cant access the keyword
				System.out.println(clgname);//staticfinal := without object we can access staticfinal's keyword but we cannot edit
				Static st=new Static();
				System.out.println(st.pi); //fianl:= we can't access without object and it's a constant value we cant change
				System.out.println(name="sarath");// we can change the value
				
	}

}
