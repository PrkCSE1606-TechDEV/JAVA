class ExceptionDemo3
{
    public static void main(String args[])
    {
        try
        {
        int a=4, b=0, c=3;
        String str = null;
        int arr[] = {3, 5, 6, 7};
        System.out.println("Execution-1");
        System.out.println(a/c);
        System.out.println(a/b);
        System.out.println("Execution-2");
        System.out.println("StringLength="+str.length());
        System.out.println("Execution-3");
        System.out.println("Value From Array="+arr[4]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Inside the Arithmetic Expression");
        }
        catch(NullPointerException e)
        {
            System.out.println("Inside the NullPointerException");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Inside the ArrayIndexOytOfBoundsException");
        }
    } 
}

/*
class ExceptionDemo3 {
    public static void main(String[] args) 
    {
        int a = 4, b = 0, c = 3;
        String str = null;
        int[] arr = {3, 5, 6, 7};
        System.out.println("Execution-1");
        try 
        {
            System.out.println(a / c);
        } 
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        try 
        {
            System.out.println(a / b);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println(e);
        }
        System.out.println("Execution-2");
        try 
        {
            System.out.println("StringLength=" + str.length());
        } 
        catch (NullPointerException e) 
        {
            System.out.println(e);
        }
        System.out.println("Execution-3");
        try 
        {
            System.out.println("Value From Array=" + arr[4]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }
    }
}

The second progarm that is marked as comment is to print all the Exceptions and required output.
In the current code, all risky statements are in one try block. 
When a/b throws an ArithmeticException, Java jumps to its matching 
catch and skips the rest of that try block. The other exceptions are never reached.

By putting each operation that may fail in its own try/catch, so the program can 
continue after each one.

Printing (e) shows the Exception type ans message. This way, each exception is handled
independently and the later output still runs.
*/