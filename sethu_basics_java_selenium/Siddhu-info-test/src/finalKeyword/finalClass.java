package finalKeyword;

class inheritClass{
//	final void method2(){  
	 void method2(){
		System.out.println("inherit class - method 2 text");
	}
}


//main class


//final class finalClass extends inheritClass{
	class finalClass extends inheritClass{
	// final String a="ragavendra";
	 
		 void method1(){
			String a="ragavendra";
			a="w/o final key word ragavendra changed to siddhu";
			System.out.println(a);
		}
		 
		final void method2(){
				System.out.println("main class - method 2 text");
			}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalClass m =new finalClass();
		m.method2();
		inheritClass m2 = new inheritClass();
		m2.method2();
		
		
}
}
