/*  Interface in Java---> In Java, an interface is a contract that specifies 
    what methods a class should provide. A class uses implements to follow that contract.
    Interfaces are useful for abstraction and polymorphism.
*/


abstract class AbstractDemo // Declaring Abstract class.
{
    abstract void Sum(); // Declaring Abstract method.
    public void display()
    {
        System.out.println("In the display method.");
    }
}
class SubClass extends AbstractDemo
{
    public void Sum()
    {
        System.out.println("In the Sum Method.");
    }
}
class Demo3 
{
    public static void main(String[] args) 
    {
        AbstractDemo obj; //Cannot create any particular object for abstract class.
        obj = new SubClass();
        obj.display();
        obj.Sum();
    }    
}
