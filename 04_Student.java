class Student 
{
    int a;
    static int b;
    public void display()
    {
        b = 100;
        System.out.println(b);
        Student.b = 100;
    }  
    public static void change()
    {
        b = 200;
        System.out.println(b);
    }
    public static void main(String[] args)
    {
        System.out.println(Student.b); // Access static variable using class name.
        Student std = new Student(); // Access static method using object reference.
        std.display();
        change();
    }
}
