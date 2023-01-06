package basicPrograms;

class test2{
	void anand(){
		System.out.println("anand works");
	}
	void two(){
		System.out.println("check two");	
	}
}

class test extends test2{
	void one(){
		System.out.println("check one");
	}
	void two(){
		System.out.println("check two");	
	}
}

public class inheritance extends test{
	
	void three(){
		System.out.println("check three");
	}
	void four(){
		System.out.println("check four is ok");	
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inheritance in = new inheritance(); 
		in.one();
		in.two();
		in.three();
		in.four();
		in.anand();
	}

}
