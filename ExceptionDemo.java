/* Exception Handling using Multiple catch() statements.

This program demonstrates exception handling using multiple catch statements.
The try block performs array access, number conversion, and division operations.
Different catch blocks handle ArithmeticException, ArrayIndexOutOfBoundsException,
NumberFormatException, and other unexpected exceptions separately.
The program accepts the array index and divisor through command-line arguments.
*/

class ExceptionDemo
{
	public static void main(String[] args)
	{
		try //Try block is used to performs array access, number conversion, and division operations.
		{
			int a=5, b=0, c=2, d1, d2;
			String str = null;
            d1 = a/c;
			System.out.println(d1);
			d2 = a/b;
			System.out.println(d2);
			System.out.println(str.length());
            
		}
		catch (ArithmeticException e) // catch() is used to handle exceptions and prevent abnormal termination of the program.
		{
			System.out.println("Inside the ArithemeticException");
		}
		catch (NullPointerException exception)
		{
			System.out.println("Inside the NullPointerException");
		}
		catch (ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Inside the ArrayIndexOutOfBoundsException");
		}
	}
}