// Method Overriding

class Parent // Super Class
{
    int a = 10;
    public void display()
    {
        System.out.println(a);
    }
}
class child extends Parent // Sub Class
{
    public void display()
    {
        System.out.println("Inside Sub Class.");
    }
}
class Test2 // Main Class
{
    public static void main(String args[])
    {
        Parent p = new Parent();
        child c = new child();
        p.display(); // It will call the display() method from the Parent class and print the value of 'a' which is 10.
        c.display(); // It will call the display() method from the child class and print "Inside Sub Class."
    }    
}
