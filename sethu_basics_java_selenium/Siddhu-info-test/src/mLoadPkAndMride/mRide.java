package mLoadPkAndMride;

class classOne{
	void one(){
		System.out.println("method one from class one");
	}
}

class classTwo extends classOne{
	void one(){
		System.out.println("method one from class two");
	}
}

class classThree extends classOne{
	void one(){
		System.out.println("method one from class three");
	}
}

class classFour extends classOne{
	void one(){
		System.out.println("method one from class four");
	}
}

class classFive extends classOne{
	void one(){
		System.out.println("method one from class five");
	}
}

public class mRide {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classOne obj;
		
		obj = new classOne();
		obj.one();
		
		obj = new classTwo();
		obj.one();
		
		obj = new classThree();
		obj.one();
		
		obj = new classFour();
		obj.one();	
		
		obj = new classFive();
		obj.one();	
	}
}
