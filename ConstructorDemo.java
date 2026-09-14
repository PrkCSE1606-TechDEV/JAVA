class ConstructorDemo
{
    int a, b, c;
    double p;;
    ConstructorDemo()
    {
        a=20;
        b=0;
        c=25;
        p=17.5;
        System.out.println("Inside Default Constructor");
    }
    ConstructorDemo(int x, int y)
    {
        a=x;
        b=y;
        c=a+b;
        System.out.println("Inside Parameterized Constructor");
        System.out.println(c);
    }
    public static void main(String[] args) 
    { 
        ConstructorDemo cd = new ConstructorDemo();
        ConstructorDemo obj = new ConstructorDemo(5, 6);
        System.out.println(cd.a);
        System.out.println(obj.a);
    }
}

/* In this program in lines 23 and 24 there is yellow hilighting over cd and obj 
   because they are declared but not used. cd and obj store the created objects, 
   but nothing accesses them afterward. This is a warning, not a runtime or compilation failure.
*/