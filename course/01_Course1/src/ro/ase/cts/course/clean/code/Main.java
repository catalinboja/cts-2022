package ro.ase.cts.course.clean.code;

public class Main {
	
	public static void printAndCheckValue(int value) {
		System.out.println("The number is " + value);
		if(value % 2 == 0) {
			System.out.println("*It is an even number");
		}
		else {
			System.out.println("It is an odd number");
		}
	}
	
	public static void printValue(int value) {
		System.out.println("The number is " + value);
	}
	
	public static void  checkValue(int value) {
		if(value % 2 == 0) {
			System.out.println("*It is an even number");
		}
		else {
			System.out.println("It is an odd number");
		}
	}
	
	public static void printAndCheckValueClean(int value) {
		printValue(value);
		checkValue(value);
	}
	

	public static void main(String[] args) {

		{
			int localVariable = 10;
			printAndCheckValue(localVariable);
		}
		
		int anotherValue = 20;
		printAndCheckValue(anotherValue);
		
		
		if (anotherValue == 10) {
			System.out.println("It' 10");
		} else {
			System.out.println("It's different");
		}
	}

}
