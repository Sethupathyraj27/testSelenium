

class test{
	public void testMethod() {
		
		System.out.println("test first class");
	}
}
class test2 extends test{
	public void secondMethod() {
		super.testMethod();
	}
	
}
public class SuperKeyword  {
public static void main(String[] args) {

	test2 m = new test2();
	m.secondMethod();
	
}
}
