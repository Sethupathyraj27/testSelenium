package basicPrograms;

class test1{
	void fn1(){
		System.out.println("function 1");
	}
	void fn2(){
		System.out.println("function 2");
	}
} 

public class inheritance2 extends test1 {

	void fn3(){
		System.out.println("function 3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance2 obj = new inheritance2();
		
		obj.fn2();
		obj.fn3();
		obj.fn1();
	}

}
