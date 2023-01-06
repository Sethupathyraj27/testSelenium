package basicPrograms;


public class methodClass {

	void raghav(){
		int a,b,c;
		a=100;
		b=a+1050;
		c=b;
		System.out.println(c);
	}
	
	void sid(){
		int a,b,c;
		a=2;
		b=a+5;
		c=a+b;
		System.out.println(c);
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// we can create 'n' number of objects, thats not a problem
		
methodClass m2 = new methodClass();
methodClass m3 = new methodClass();
m3.raghav();
m2.sid();
}
}
