/* Exception Handling using Single catch() statement.

   A single catch() statement is used to handle an exception that may occur inside a try block. 
   If an exception occurs, the catch block executes and prevents the program from terminating 
   abnormally.
*/


class ExceptionDemo2
{
    public static void main (String args[])
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
        catch (Exception e) //catch (Exception e) means “if any common exception occurs, catch it and store its details in e.
        {
            System.out.println("Exception-1");
            System.out.println(e.toString());
        }
    }
}

/* catch (Exception e) means the catch block will catch and handle an exception of type Exception.

Exception → A general parent class for many exceptions in Java.
e → A variable that stores the exception object/details.
It can be used to get information about the error, e.g. e.getMessage().
*/