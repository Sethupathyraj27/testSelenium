package basicPrograms;

abstract class arun{
	abstract public void method2();
	abstract public void method3();
	public void method1(){
		System.out.println("method 1 works");
	}
	
//	abstract class with constructor - (i-e) class name with same name as 
//	mentioned in abs class
	int arunVar1, arunVar2;
	
	arun(){
		System.out.println("arun cons 1 works");
	}

}

class arun2 extends arun{
	
	 public void method2(){
		System.out.println("abs method works");
	}
	 public void method3(){
			System.out.println("abs method 3 works");
		}
	 	 
} 

public class absClass {
int a,b;

	 absClass(int a1,int b1){
		a=a1;
		b=b1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arun2 object = new arun2();
		object.method1();
		object.method2();
		object.method3();
		
		absClass object2 = new absClass(10,-100);
		System.out.println(object2.a-object2.b);
	}

}
