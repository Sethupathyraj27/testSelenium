package constructorWithArg;

public class orgConstructor {
int a,b,c;
	orgConstructor(int a1,int b1,int c1){
		a=a1;
		b=b1;
		c=c1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orgConstructor m =new orgConstructor(10,10,20);
		System.out.println(+m.a+m.b+m.c);
	}

}
