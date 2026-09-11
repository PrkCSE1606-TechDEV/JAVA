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
        Student std = new Student();
        std.display();
        change();
    }
}
