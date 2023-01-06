package basicPrograms;


//multi level inheritance with interface


interface siddhu3{
	void method111();
	void method222();
	void method333();
}
interface siddhu2{
	void method11();
	void method22();
	void method33();
}
//
//interface siddhu{
//	void method1();
//	void method2();
//	void method3();
//}

class classA implements siddhu3,siddhu2{
	public void method111(){
		System.out.println("method 1");
	}
	public void method222(){
		System.out.println("method 2");
	}public void method333(){
		System.out.println("method 3");
	}
	
	public void method11(){
		System.out.println("method 1");
	}
	public void method22(){
		System.out.println("method 2");
	}public void method33(){
		System.out.println("method 3");
	}
}

class anand extends classA{
	public void method1(){
		System.out.println("method 1");
	}
	public void method2(){
		System.out.println("method 2");
	}public void method3(){
		System.out.println("method 3");
	}
	
}

public class interfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		anand a1 = new anand();
		a1.method1();
		a1.method2();
		a1.method3();
		a1.method11();
		a1.method22();
		a1.method33();
		a1.method111();
		a1.method222();
		a1.method333();

	}

}
