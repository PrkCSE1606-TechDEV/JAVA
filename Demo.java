/*Dynamic Method Dispatching---> This is a process in which a call to an overridden method is 
resolved at runtime rather than compile-time. It is also known as Runtime Polymorphism. 
In Java, dynamic method dispatch is achieved through method overriding.
*/

class Shape
{
    public void draw()
    {
        System.out.println("Draw the Shape");
    }
}
class Triangle extends Shape
{
    public void draw()
    {
        System.out.println("Draw a Triangle");
    }
}
class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("Draw a Rectangle");
    }
}
class Demo 
{
    public static void main (String ar[])
    {
        Shape s; // Reference variable of type Shape.
        s = new Shape(); // s refers to Shape object.
        Triangle T = new Triangle(); // T refers to Triangle object.
        Rectangle R = new Rectangle(); // R refers to Rectangle object.
        s.draw(); // It will call the draw() method from the Shape class and print "Draw the Shape".
        T.draw(); // It will call the draw() method from the Triangle class and print "Draw a Triangle".
        R.draw(); // It will call the draw() method from the Rectangle class and print "Draw a Rectangle".
        s = new Triangle(); // s now refers to Triangle object.
        s.draw(); // It will call the draw() method from the Triangle class and print "Draw a Triangle".
        s = new Rectangle(); // s now refers to Rectangle object.
        s.draw(); // It will call the draw() method from the Rectangle class and print "Draw a Rectangle".
    } 
}
