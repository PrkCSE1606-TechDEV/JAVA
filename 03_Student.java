class Student 
{
    int a, b;
    Student()
    {
        this(100);
        a=20;
        b=10;
        System.out.println(a+b);
    }
    Student(int s)
    {
        this(15.5);
        System.out.println(s);
    }
    Student(double d)
    {
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        Student std = new Student();
        System.out.println(std.a);
    }
}
