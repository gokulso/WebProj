package exceptiontest;

public class JavaExceptionFinally {

	public static void main(String[] args) {

		
		System.out.println("Inside Main : = " + someotherMethod());
		

	}

	private static int someotherMethod() {
		
		int fraction;

		try {
			int d = 0;
			int n = 20;
		   fraction = n / d;
		} catch (ArithmeticException e) {

			System.out.println("In the catch clock due to Exception = " + e);
			return 0;
		} finally {
			System.out.println("Inside the finally block");
		}
		
		

		System.out.println("In some other method");
		
		return fraction;

	}

}
