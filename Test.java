class Test 
{
    int x;
    float y, sum;
    public void Addition(int a, float b)
    {
        this.sum = a+b;
    }
    public void display(Test obj)
    {
        System.out.println(obj.x);
        System.out.println(obj.sum);
    }
    public static void main(String[] args) 
    {
        Test obj = new Test();
        Test t = new Test();
        obj.Addition(5, 5.0000012f);
        t.Addition(5, 7.223f);
        obj.display(obj);   
        t.display(t);
    } 
}
