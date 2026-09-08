class Student
{
    int x;
    static int y;
    public void sum (int x, int y)
    {
        int z;
        z = x+y;
        System.out.println(z);
    }
    public static void main(String[] args) 
    {
        Student obj = new Student();
        obj.sum(5,2);   
    } 
}