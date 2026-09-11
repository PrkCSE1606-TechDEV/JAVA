class Outer
{
    int a = 10;
    static int b = 20;
    static class Inner
    {
        public void display()
        {
            System.out.println(b); // Access static variable using class name for Static nested class.
        }
    }    
}
class StaticClassDemo  // Use this class to call the static nested class, and get the output.
{
    public static void main(String[] args)
    {
        Outer.Inner obj = new Outer.Inner(); // Create object of Inner class using Outer class name.
        obj.display(); // Call display() using Inner class object.
    }
}
