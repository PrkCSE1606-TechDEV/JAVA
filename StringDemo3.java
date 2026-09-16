// Dot Equals Method

class StringDemo3 
{
    public static void main(String args[])
    {
        String str1 = new String("Kahalgaon");
        String str2 = new String("Kahalgaon");
        String str3 = new String("kahalgaon");
        System.out.println(str1.equals(str2)); // It will return true because str1 and str2 have the same content.
        System.out.println(str1.equals(str3)); // It will return false because str1 and str3 have different content (case-sensitive).
        str1 = str2; // Assigning str2 to str1, now both refer to the same object in memory.
        System.out.println(str1 == str2); // It will return true because str1 and str2 refer to the same object in memory.
        System.out.println(str1.compareTo(str2)); // It will return 0 because str1 and str2 have the same content.
        System.out.println(str2.compareTo(str1)); // It will return 0 because str2 and str1 have the same content.
        System.out.println(str1.compareTo(str3)); // It will return a negative value because str1 is lexicographically less than str3 (case-sensitive).
    }
}


/* NOTE:
System.out.println(5 == 5); ---> It shows how Dot Equals method is different from == operator. 
The == operator checks for reference equality (whether two references point to the same object), 
while the equals() method checks for value equality (whether two objects have the same content). 
In this case, 5 == 5 returns true because both are primitive int values and are equal, 
but if we were comparing two different String objects with the same content using ==, 
it would return false unless they refer to the same object in memory.
*/