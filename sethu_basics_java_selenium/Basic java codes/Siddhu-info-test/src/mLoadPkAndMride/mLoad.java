package mLoadPkAndMride;

public class mLoad {
//	int a,b,c;
	void one(int a){
		System.out.println("1st method called");
	}
	
	void one(String a){
		System.out.println("2nd method called");
	}
	
	void one(char a){
		System.out.println("3rd method called");
	}
	void one(int a, String a1){
		System.out.println("4th method called");
	}
	
	void one(String a1, char a2){
		System.out.println("5th method called");
	}
	
	void one(char a, int a1){
		System.out.println("6th method called");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mLoad m =new mLoad();
		m.one(10);
		m.one("10");
		m.one('1');
		m.one(10,"10");
		m.one("10",'5');
		m.one('1',2);
	}

}
