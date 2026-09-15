class StringDemo2 
{
    public static void main(String args[]) 
    {
        String str1 = "Durgapur";
        System.out.println(str1);
        System.out.println(str1.charAt(4)); // It will return the character at index 4 of the string str1.
        System.out.println(str1.indexOf('u')); // It will return the index of the first occurrence of 'u' in the string str1.
        System.out.println(str1.length()); // It will return the length of the string str1.
        System.out.println(str1.substring(1, 3)); // It will return a substring of the string str1 from index 1 to 3.
        System.out.println(str1.substring(3)); // It will return a substring of the string str1 from index 3 to the end of the string.
        char ch = str1.charAt(4); // It will return the character at index 4 of the string str1 and assign it to the variable ch.
        System.out.println(ch);
    }    
}
