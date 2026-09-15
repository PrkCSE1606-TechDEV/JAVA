class Array_ID 
{
    public static void main(String[] args) 
    {
        int arr1[] = {11, 22, 33, 44, 55};
        System.out.println(arr1[0]); // Accessing the first element of the array
        System.out.println(arr1[1]); // Accessing the second element of the array
        System.out.println(arr1[2]); // Accessing the third element of the array
        System.out.println(arr1[3]); // Accessing the fourth element of the array
        System.out.println(arr1[4]); // Accessing the fifth element of the array
        arr1[4] = 23; // Modifying the fifth element of the array
        System.out.println(arr1[4]); // Printing the modified fifth element
        System.out.println("The value of the array are: "); // Printing all the elements of the array using a for loop
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println("The values in the array through each for loop are: "); // Printing all the elements of the array using a for-each loop
        for(int val : arr1) //It will store the value of each element of the array in the variable val.
        {
            System.out.println(val);
        }    
    }
}
