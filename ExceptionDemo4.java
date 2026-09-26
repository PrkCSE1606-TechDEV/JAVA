/* Exception Handling with finally block
   finally block---> finally is a block that executes after the try and catch blocks, whether an exception occurs or not.
                     It is mainly used for cleanup operations, such as closing files, database connections, etc.
*/

class ExceptionDemo4
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
        catch(Exception e)
        {
            System.out.println("Inside the Exception block");
            System.out.println(e.toString());
        }
        finally
        {
            System.out.println("Inside the finally block");
        }
    } 
}