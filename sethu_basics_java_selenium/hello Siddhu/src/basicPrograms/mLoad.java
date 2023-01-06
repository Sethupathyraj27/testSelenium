package basicPrograms;

//same method names with various argument values

public class mLoad {
	public void method1(int a , String b){
    System.out.println(a+b);    
	}
	public void method1(int a , int b, char c){
	    System.out.println(a+b+c);    
		}
	
	public void method1(int a , char b, int c){
	    System.out.println(a+b+c);    
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mLoad ob = new mLoad();
		
		ob.method1(0,"7");
		ob.method1(0,"siddhu");
		
		ob.method1(5,4,'s');
		ob.method1(5,'s',4);
	}

}
