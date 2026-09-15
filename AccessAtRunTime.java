// Scanner class to demonstrate access at runtime
// How to access import java.util.*;

import java.util.*; // Importing the Scanner class from the java.util package.
class AccessAtRunTime 
{
    public static void main (String ar[])
    {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input from the user.
        System.out.println(sc); // Printing the Scanner object to show its reference in memory.
        System.out.println("Enter an integer and a string: "); // Prompting the user to enter an integer and a string.
        int a = sc.nextInt(); // Reading an integer input from the user.
        String str = sc.next(); // Reading a string input from the user.
        System.out.println("Integer value is: " + a); // Printing the integer value entered by the user.
        System.out.println("String value is: " + str); // Printing the string value entered by the user.
    }    
}
