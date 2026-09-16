class Parent
{
    int a = 100;
    public void display()
    {
        System.out.println(a); // It will print the value of 'a' which is 100.
    }
}
class Child extends Parent
{
    int a = 200;
    int b = 300;
    public void display1()
    {
        System.out.println(a); // It will print the value of 'a' which is 200.
        System.out.println(super.a); // It will print the value of 'a' from the Parent class which is 100.
        System.out.println(b); // It will print the value of 'b' which is 300.
    }
}
class InheritanceDemo
{
    public static void main(String args[])
    {
        Parent p = new Parent(); // Creating an object of Parent class.
        Child c = new Child(); // Creating an object of Child class.
        System.out.println(c.a); // It will print the value of 'a' from the Child class which is 200.
        System.out.println(c.b); // It will print the value of 'b' from the Child class which is 300.
        System.out.println(p.a); // It will print the value of 'a' from the Parent class which is 100.
        // System.out.println(c.super.a); // Error: because c is an object, and super is not a member of that object.
        System.out.println(((Parent) c).a); // (Right Way-->)It will print the value of 'a' from the Parent class which is 100, because we are casting the Child object 'c' to Parent type.
        c.display(); // It will call the display() method from the Parent class and print the value of 'a' which is 100.
        c.display1(); // It will call the display1() method from the Child class and print the values of 'a', 'super.a', and 'b' which are 200, 100, and 300 respectively.
    }
}