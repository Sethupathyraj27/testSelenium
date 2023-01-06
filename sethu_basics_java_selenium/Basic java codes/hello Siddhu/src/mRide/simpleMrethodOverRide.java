package mRide;
class parant{
	public void methodOne(){
		System.out.println("method 1 parant");
	}
}

class child extends parant{
	public void methodOne(){
		System.out.println("method 1 child");
	}
}
public class simpleMrethodOverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parant obj = new parant();
		obj.methodOne();
		child obj2 = new child();
		obj2.methodOne();
	}

}
