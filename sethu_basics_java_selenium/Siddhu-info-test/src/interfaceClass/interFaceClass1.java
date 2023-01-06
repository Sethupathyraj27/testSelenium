package interfaceClass;

interface siddhu{
	void methodOne();
	void methodTwo();
}


class siddhu2 implements siddhu{
	public void methodOne(){
		System.out.println("method 1 works");
	}
	
	public void methodTwo(){
		System.out.println("method 2 works");
	}
	
}

class ragav extends siddhu2{
	ragav(){
		System.out.println("ragav constructor");
	}
}
class ragav2 extends ragav{
	void ragavExtendMethod(){
		System.out.println("final extended class");
	}
}
public class interFaceClass1 extends siddhu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ragav2 m = new ragav2();
		m.methodOne();
		m.methodTwo();
		
		
	}

}
