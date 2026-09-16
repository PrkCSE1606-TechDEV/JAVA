// Super Method is used to call the superclass constructor from the sub class constructor.

class Parent
{
    int a = 10;
    Parent()
    {
        System.out.println(a);
    }
}
class child extends Parent
{
    child()
    {
        super(); // Calls Parent class constructor
        System.out.println("Inside Sub Class.");
    }
}
class Test4
{
    public static void main(String args[])
    {
        Parent p = new Parent(); // It will call the constructor of the Parent class and print the value of 'a' which is 10.
        child c = new child(); // It will call the constructor of the child class, which in turn calls the constructor of the Parent class.
        System.out.println(p.a); // It will print the value of 'a' from the Parent object 'p'.
        System.out.println(c.a); // It will print the value of 'a' from the child object 'c'.
    }
}