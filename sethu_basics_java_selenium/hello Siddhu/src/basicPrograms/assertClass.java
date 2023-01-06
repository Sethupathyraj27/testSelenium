package basicPrograms;

import java.util.Scanner;

public class assertClass {
public static void main(String[] args) {
	
//	String name = "anand";
//	assert name=="siddhu":"name is not anand";
	
//	int age = 0;
//	assert age>=27:"age assertion";
	
	String a1 = "anand";
	String a2 = "anand";
	assert (a1==a2):"length not matched";
	
//	scnner code
	System.out.println("enter your name");
Scanner a3 = new Scanner(System.in);
String value = a3.nextLine();
System.out.println(value);

	
}




//private static String anand() {
//	// TODO Auto-generated method stub
//	return "name is not anand";
//}



}
