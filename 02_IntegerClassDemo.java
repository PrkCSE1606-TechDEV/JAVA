class IntegerClassDemo 
{
    public static void main(String[] args)
    {
        String str = "321";
        System.out.println(str+13); /*When a String is involved with the + operator, 
                                    Java performs string concatenation, converting the 
                                    non-String operand to its string form.*/

        int a = Integer.parseInt(str); // Converting String to integer using parseInt() method.
        System.out.println(a);
        System.out.println(a+1); /*Now, since a is an integer, the + operator performs 
                                    arithmetic addition, resulting in 334.*/

        int z = 333;
        String st = Integer.toString(z); // Converting integer to String using toString() method.
        System.out.println(st);
        System.out.println(Integer.valueOf("56")); // Converting String to Integer using valueOf() method.
        System.out.println(Integer.max(88, 78)); // Finding maximum of two integers using max() method.
        System.out.println(Integer.min(88, 78)); // Finding minimum of two integers using min() method.
        System.out.println(Integer.sum(88, 78)); // Finding sum of two integers using sum() method.
        System.out.println(Integer.toBinaryString(16)); // Converting integer to binary string using toBinaryString() method.
        System.out.println(Integer.toHexString(61)); // Converting integer to hexadecimal string using toHexString() method.
        System.out.println(Integer.toOctalString(10)); // Converting integer to octal string using toOctalString() method.
        System.out.println(Integer.bitCount(116)); // Counting the number of one-bits in an integer using bitCount() method.
    }    
}
