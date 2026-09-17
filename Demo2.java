/* Abstract class and Abstract method
>> Abstract class is a class that is declared with the abstract keyword. 
   It can have abstract methods (methods without a body) as well as concrete methods 
   (methods with a body). An abstract class cannot be instantiated, meaning you cannot 
   create an object of an abstract class. It is meant to be subclassed, and its abstract
   methods must be implemented by its subclasses. 
>> Abstract method is a method that is declared without an implementation. 
   It is meant to be overridden in subclasses. An abstract method can only exist in an 
   abstract class. When a subclass extends an abstract class, it must provide implementations 
   for all the abstract methods of the superclass, unless the subclass is also declared as 
   abstract.
*/

abstract class Shape
{
    abstract public void draw(); // Abstract method without a body. It must be implemented by subclasses.
    
}
class Demo2 {
    
}
