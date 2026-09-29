/* throw Keyword in Exception calss
   The throw keyword is used to manually generate (throw) an exception in a Java program.
   It is mainly used when a specific condition occurs and the programmer wants to indicate 
   that an error or exceptional situation has occurred.
*/

class ThrowExceptionDemo 
{
    public static void main(String args[]) 
    {
        try 
        {
            int age = 15;

            if (age < 18) 
            {
                throw new ArithmeticException("You are not eligible to vote."); //Manually creates and throws an ArithmeticException with the message "You are not eligible to vote."
            }
        }
        catch (Exception e) 
        {
            System.out.println(e.toString()); //Prints the exception type and its message.
            System.out.println(e.getMessage()); //Prints only the exception message.
        }
       System.out.println("You can vote.");
    }
}

// In simple words: catch catches the error, e.toString() shows the exception type + message, and e.getMessage() shows only the message.