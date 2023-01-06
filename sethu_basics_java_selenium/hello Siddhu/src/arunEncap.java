//package abstractAndEncap;


  class base1 extends base{
	void sum()
	{
		int a=10,b=15,c;
		c=a+b;
		System.out.println("sum of "+a+" and "+b+" is : "+c);
	}
  }
  abstract class base {
		base()
		{
			System.out.println("Base constructor called");
		}
	}
public class arunEncap{
	arunEncap(){
		System.out.println("test arunEncap");
	}
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		//base1 obj=new base1();
		base1 obj1=new base1();
		obj1.sum();
		
		arunEncap obj2 = new arunEncap();
		
		
}
	}


