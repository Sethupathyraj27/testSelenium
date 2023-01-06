package abstractPK;

abstract class classOne{
	
	//abstract class with constructor 
		classOne(){
			System.out.println("constructor classOne class");
		}
		
		
	abstract void one();
	abstract void two();
	void three(){
		System.out.println("method 3 calls normally");
	}
}
class classTwo extends classOne{
	
//abstract class with constructor 
	
	void one(){
		System.out.println("method one abstract class");
	}
	
	void two(){
		System.out.println("method two abstract class");
	}
	classTwo(){
		System.out.println("constructor classTwo class");
	}
} 

public class absClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("test main class");
		classTwo m =new classTwo();
		m.three();
		m.one();
		m.two();
//		
		
	}

}
