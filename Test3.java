/*
final keyword is used to restrict the user. The final keyword can be used in many context. 
It can be used with variable, method and class. When a variable is declared as final, 
it means that the value of the variable cannot be changed once it has been assigned. 
When a method is declared as final, it means that the method cannot be overridden by subclasses. 
When a class is declared as final, it means that the class cannot be subclassed.
*/


class Parent
{
    int a = 10, b = 20;
    public void display()
    {
        System.out.println(a+b);
    }
}
class child extends Parent
{
    public void Calculate()
    {
        System.out.println(a-b);
    }
}
class Test3 
{
    public static void main(String args[])
    {
        Parent p = new Parent();
        child c = new child();
        p.display(); // It will call the display() method from the Parent class and print the value of 'a+b' which is 30.
        c.Calculate(); // It will call the Calculate() method from the child class and print "a-b" which is -10.
        final int x = 10; // final variable---> it cannot be changed once it has been assigned.
        System.out.println(x); // It will print the value of 'x' which is 10.
    }
}