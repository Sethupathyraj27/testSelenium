package basicPrograms;

public class ifElseAndLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		simple if else program
		
		int a=1;
		
		if(a==1){
			System.out.println(a +" is greater");
		}
		else{
			System.out.println(a +" is smaller");
		}
		int rank=2;
		if( rank>10) {
			System.out.println("good rank");
		}
		else {
			System.out.println("poor rank");
		}
		
// nested if else
		
		int marks=69;
		if(marks>=41 && marks<=69){
			System.out.println("border pass");
		}
		
		else if(marks>=70 && marks<=89){
			System.out.println("normal pass");
		}
		
		else if(marks>=90 && marks<=100){
			System.out.println("distinction pass");
		}
		
		else if(marks>100){
			System.out.println("please enter valid mark");
		}
		else{
			System.out.println("fail");
		}
		
		
//		sir notes-ifElse
		
//		int mark=11;
//		
//		if(mark>=90)
//		{
//			System.out.println("outstanding mark");
//		}
//		
//		else if(mark>=80)
//		{
//			System.out.println("distinction mark");
//			}
//		else if(mark>=60)
//		{
//			System.out.println("fistclass mark");
//			}
//		else
//		{
//			System.out.println("not elegible to join ");
//			}

		
//for loop
		
		char k[]={'a','b','c','d','e'};
		System.out.println(k.length);
	System.out.println("for loop below");
for(int z=0;z<k.length;z++){
	System.out.println(k[z]+" ");
}

// char while loop
System.out.println("while loop below");
int z=0;
while(z<k.length) {
	System.out.println(k[z]+" ");
	z++;
}

// char in doWhile loop
int z1=0;
System.out.println("do while loop below");
do {
	System.out.println(k[z1]+" ");
	z1++;
}
while(z1<k.length);



//
//for (int y=20;y>=10;y--){        /* || or, && and */
//	System.out.print(y+" ");
//}
//		

int x=18;
int w=1;
while(x>=17 && x<25)
{
	System.out.print(w+++" ");
	System.out.println("while loop executed");
	x++;
}





String myArray[]={"ragav","siddhu","anand","arun"};

int w1=0;
while(w1<myArray.length)
{
	System.out.print(w1+1+" "+myArray[w1]+" ");
	w1++;
}

int w2=4;
String myArray2[]={"sulur","pollachi","cbe","tirupur","namakal"};
do{
System.out.println(myArray2[w2]);
w2--;
}
while(w2<myArray2.length && w2>=0);

// string reverse

String anand="hdnanA";
StringBuffer anand2 = new StringBuffer(anand);
anand2.reverse();
System.out.println(anand2);
String anand3=anand.replace("a","z");
System.out.println(anand3);

}
}
