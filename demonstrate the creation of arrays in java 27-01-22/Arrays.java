class Arrays
{
    public static void main(String args[])
    {
        System.out.println("This is a 1d array: ");
        int array1d[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array1d.length; ++i)
        {
            System.out.print(" " + array1d[i]);
        }

        System.out.println("\nThis is a 2d array: ");
        int array2d[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };   
        for(int i = 0; i < array2d.length; ++i)
        {
            for(int j = 0; j < array2d.length; ++j)
            {
                System.out.print(" " + array2d[i][j]);
            }
            System.out.println();
        }
    }
}