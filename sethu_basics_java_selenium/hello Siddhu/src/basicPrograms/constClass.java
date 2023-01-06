package basicPrograms;

public class constClass {

//	procedure for constructor

//	step 1 -> create common variable above the constructor block
//	step 2 -> create constructor and arguments with another variable names
//	step 3 -> assign old variable to new variable names
//	step 4 -> create object at main class and call it through print statement

	int a, b;

	public constClass(int varA, int varB) {
		a = varA;
		b = varB;
	}

	public static void main(String[] args) {
		constClass m = new constClass(15, 5);
		System.out.println(m.a - m.b);

	}
}
