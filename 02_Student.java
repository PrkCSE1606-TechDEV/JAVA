class Student
{
    int Roll;
    static float marks;
    public void sum (int x, float y)
    {
        float z;
        z = x+y;
        System.out.println(z);
    }
    public static void main(String[] args) 
    {
        Student dps = new Student();
        dps.sum(5,2.54f);   
    }
}