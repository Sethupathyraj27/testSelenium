
package inherit;

class siddhu{
	void siddhuMethod(){
		System.out.println("siddhuMethod works");
	}
}

public class inheritClass extends siddhu{
	
	void siddhuMethod1(){
		System.out.println("siddhuMethod 2 works");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritClass m =new inheritClass();
		m.siddhuMethod();
		m.siddhuMethod1();
	}

}
