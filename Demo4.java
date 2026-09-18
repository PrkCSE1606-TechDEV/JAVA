/*  Interface Class---> It usually contains method declarations and constants. 
A class uses implements to provide the actual method implementations. 
An interface supports abstraction and allows a class to follow multiple contracts. 
A class can implement multiple interfaces, but it can extend only one class.
*/


interface InterfaceDemo 
{
    int x = 90; // Implicitly public, static, and final

void sum();     // Implicitly public and abstract
    void display(); // Implicitly public and abstract
}

interface SecondInteface 
{
    void sum();
}

class Child1 implements InterfaceDemo 
{
    @Override
    public void sum() {
        System.out.println("In the sum method.");
    }

@Override
    public void display() {
        System.out.println("In the display method.");
    }
}

class Demo4 
{
    public static void main(String[] ar) 
    {
        System.out.println(InterfaceDemo.x);

        Child1 obj = new Child1();
        obj.sum();
        obj.display();
    }
}
