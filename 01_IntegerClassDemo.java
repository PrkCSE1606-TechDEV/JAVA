class IntegerClassDemo
{
    public static void main(String[] args)
    {
        Integer a = 90;
        int x = a; // Unboxing: converting Integer to int.
        System.out.println(a);
        System.out.println(x);
        int y = 100;
        Integer z = y; // Autoboxing: converting int to Integer.
        System.out.println(a);
        System.out.println(z);
    }    
}