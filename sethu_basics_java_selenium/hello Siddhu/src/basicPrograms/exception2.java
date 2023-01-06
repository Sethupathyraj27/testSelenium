package basicPrograms;

public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
//	arithmetic exception
	int a = 0;
	System.out.println((1)/a);
	
}
catch(ArithmeticException  error){
	System.out.println(error);
}

try{
	
//	arrayIndexOutofBound exception
	String a1 [] = {"a","b","c"};
	System.out.println(a1[3]);
}
catch(ArrayIndexOutOfBoundsException  error){
	System.out.println(error);
}

try{
	
//	StringIndexOutofBound exception
	String a2 = "abcdef";
	System.out.println(a2.charAt(10));
}
catch(StringIndexOutOfBoundsException  error){
	System.out.println(error);
}

try{
	
//	Null point exception
	Object a3 = null;
	System.out.println(a3.toString());

}
catch(NullPointerException error){
	System.out.println(error);
}

// few more basic exceptions
// 1. timeOutException 2. NoSuchElementException 3. ElementNotVisibleException 
// 4. WebDriverException 
// 5. StaleElementException(element is either deleted or no longer access) 

}
}
