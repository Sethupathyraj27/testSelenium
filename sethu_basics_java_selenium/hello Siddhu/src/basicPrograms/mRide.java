package basicPrograms;

class class1{
	public void method1(int a1,String b) {
	System.out.println(a1);
	}
}

public class mRide extends class1{
	int a;
	public void method1() {
		System.out.println(12);
		}
	
	private void method2() {
		System.out.println("main class method 2 works");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mRide obj = new mRide();
		class1 obj2 = new class1();
		obj.method1(12,"anand");
		obj2.method1(5,"sid");
		obj.method2();
	}

}

