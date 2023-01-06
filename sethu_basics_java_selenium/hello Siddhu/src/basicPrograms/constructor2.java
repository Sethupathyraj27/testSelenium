package basicPrograms;

public class constructor2{
int one;
int two;

public constructor2(int oneone, int twotwo){
	one=oneone;
	two=twotwo;
}
//multiple constructor can be added in same class

//int a;
//String b;
//char c;
//
//public constructor2(int a1, String b1, char c1){
//	a=a1;
//	b=b1;
//	c=c1;
//}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructor2 m = new constructor2(3,13);

//constructor2 m2 = new constructor2(3,"10",'a');


System.out.println(m.one-m.two);
//System.out.println(m2.a+m2.b+","+m2.c);

	}

}
