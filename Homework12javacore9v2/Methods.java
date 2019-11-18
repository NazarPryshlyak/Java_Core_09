package Homework12javacore9v2;

public class Methods {
	
	private static int a;
	private static int b;

	public Methods(int a1, int b1) {
		a = a1;
		b = b1;
	}
	
	public int plus() throws MyException {
		Methods.check();
		return a + b ;
	}
	public int minus() throws MyException {
		Methods.check();
		return a - b ;
	}
	public int multiply() throws MyException {
		Methods.check();
		return a * b ;
	}
	public int devide() throws MyException {
		Methods.check();
		return a / b ;
	}
	static void viewCalcResult(double result) {
		System.out.println( " Результат дорівнює " + result);
	}
		static void check() throws MyException {
			if ((a < 0) && (b < 0 )) {
				throw new IllegalArgumentException();
				}
			if (((a == 0) && (b != 0 )) || ((a != 0) && (b == 0 ))) {
				throw new ArithmeticException();
		        }
			if ((a == 0) && (b == 0 ))  {
				throw new IllegalArgumentException();
			    }
			if ((a > 0) && (b > 0 ))  {
				throw new MyException( " This is a non-working calculator! " );
			    }
		
	}
}
