package basicPrograms;

public class exceptionClass {

	public void method1(){
		
			int a,b,c;
			
			a=10;b=10;c=a+b;
			System.out.println(a+b+c);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  try {
//		      int[] myNumbers = {1, 2, 3};
//		      System.out.println(myNumbers[1]);
//		    } catch (Exception e) {
//		      System.out.println("Something went wrong.");
//		    }
		  
		  try{
			  exceptionClass m = new exceptionClass();
			  m.method1();
		  }
		  catch(Exception e){
			  System.out.println("method 1 error block");
		  }
		  System.out.println("after error");
		  
}
}
