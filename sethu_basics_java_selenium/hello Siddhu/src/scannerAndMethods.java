import java.util.Scanner;

public class scannerAndMethods {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		String userName;
		String pwd;
		
		System.out.println("enter user name");
		userName=scan.nextLine();
		System.out.println("enter password");
		pwd=scan2.nextLine();
		
	System.out.println("username is: "+userName);
	System.out.println("pwd is: "+pwd);
	
	
		System.out.println("enter your name");
		Scanner a = new Scanner(System.in);
		
		String name;
		String age;
		name=a.nextLine();
		System.out.println("enter your age");
		Scanner a2 = new Scanner(System.in);
		age=a2.nextLine();
		
		System.out.println(name);
		System.out.println(age);
		
			
}
}
