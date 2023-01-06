package multiLevelInheritWithInterface;

interface class1{
	public void one();
}

class class2 implements class1{
	int a=1;
	int b=2,tot=a+b;
	public void one(){
		System.out.println("added value is: "+tot);
	}
}

public class multiInheritWithInterfaceClass extends class2{
int c=a-b;
	public void two(){
		System.out.println("Sub value is: "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try{
		multiInheritWithInterfaceClass m = new multiInheritWithInterfaceClass();
		m.one();
		m.two();
	}
	catch(Exception error){
		System.out.println("error msg");
	}
	}

}
