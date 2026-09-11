class Outer 
{
    int a = 5;
    public void OuterMethod()
    {
        System.out.println(a);
    }
    class Inner 
    {
        int b = 10;
        public void InnerMethod()
        {
            System.out.println(b);
            System.out.println(a);
            OuterMethod();
        }
    }
    public static void main(String[] args) 
    {
        Outer.Inner obj = new Outer().new Inner(); // Create object of Inner class using Outer class object.
        obj.InnerMethod(); // Call InnerMethod() using Inner class object.
    }
}
