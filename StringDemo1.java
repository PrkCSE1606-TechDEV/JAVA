//String Class Demo in Java

class StringDemo1 
{
    public static void main(String[] args) 
    {
        String str = "Durgapur";
        System.out.println(str);
        str = "Kolkata"; // Reassigning the value of str to a new string "Kolkata".
        System.out.println(str);
        for(int i = 1; i <= 5; i++) // Using a for loop to print the value of str five times.
        {
            str = str + i; // Concatenating the current value of str with the loop index i and reassigning it to str..
        }
        System.out.println(str); // Printing the final value of str after concatenation.
    }
}
