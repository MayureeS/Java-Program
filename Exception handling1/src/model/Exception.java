package model;

public class Exception {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = 0 ;
		try
		{
			 c = a/b ;
		} catch(ArithmeticException e){
			System.out.println("The divisor should not be 0");
		}
		System.out.println("Division is :"+c);
	}

}
