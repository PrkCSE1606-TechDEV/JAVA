// Autoboxing and Unboxing in Java

class CharacterClassDemo 
{
    public static void main (String args[])
    {
        char ch1 = 'A', ch2 = 'a', ch3 = '1', ch4 = ' ';
        System.out.println(Character.isLetter(ch1)); //It checks whether the specified character is a letter or not.
        System.out.println(Character.isLetter(ch2));
        System.out.println(Character.isDigit(ch3)); //It checks whether the specified character is a digit or not.
        System.out.println(Character.isDigit(ch2));
        System.out.println(Character.isUpperCase(ch1)); //It checks whether the specified character is an uppercase letter or not.
        System.out.println(Character.isUpperCase(ch2));
        System.out.println(Character.isUpperCase(ch3));
        System.out.println(Character.isLowerCase(ch2)); //It checks whether the specified character is a lowercase letter or not.
        System.out.println(Character.isLowerCase(ch1));
        System.out.println(Character.isLowerCase(ch3));
        System.out.println(Character.isWhitespace(ch4)); //It checks whether the specified character is a whitespace or not.
        System.out.println(Character.isWhitespace(ch1));
        System.out.println(Character.isWhitespace(ch3));
        System.out.println(Character.isWhitespace(ch2));
        char ch5 = Character.toUpperCase(ch2); //It converts the specified character to uppercase.
        System.out.println(ch5);
        char ch6 = Character.toLowerCase(ch1); //It converts the specified character to lowercase.
        System.out.println(ch6);
        System.out.println(Character.isLetterOrDigit('2')); //It checks whether the specified character is a letter or digit or not.
        System.out.println(Character.isLetterOrDigit('A'));
        System.out.println(Character.isLetterOrDigit('#'));
    }
}
