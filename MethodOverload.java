class MethodOverload 
{
    float n;
    int a, b, c;
    double p;
    public void calculate(int x, int y)
    {
        a=x;
        b=y;
        c=a+b;
        System.out.println(c);
    }    
    public void calculate(int x, float y)
    {
        float d;
        a=x;
        b=(int)y;
        d=a-b;
        System.out.println(d);
    }
    public void calculate(double x, int y)
    {
        double r;
        p=x;
        b=y;
        r=a*b;
        System.out.println(r);
    }
    public static void main(String[] args) 
    { 
        MethodOverload mo = new MethodOverload();
        mo.calculate(5.2f, 6);
        mo.calculate(5, 6.5f);
        mo.calculate(7, 6);
    }
}