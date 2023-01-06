package mRide;


class anandClass{
	public void methodOne(){
		System.out.println("anandClass method 1");
	}
}

class class2 extends anandClass{
	public void methodOne(){
		System.out.println("class2 method 1");
	}
}

class class3 extends anandClass{
	public void methodOne(){
		System.out.println("class3 method 1");
	}
}

class class4 extends anandClass{
	public void methodOne(){
		System.out.println("class4 method 1");
	}
}

class class5 extends anandClass{
	public void methodOne(){
		System.out.println("class5 method 1");
	}
}
public class largeMethodOverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anandClass object;
		object = new anandClass();
		object.methodOne();
		
		object = new class2();
		object.methodOne();
		
		object = new class3();
		object.methodOne();
		
		object = new class4();
		object.methodOne();
		
		object = new class5();
		object.methodOne();
	}

}
