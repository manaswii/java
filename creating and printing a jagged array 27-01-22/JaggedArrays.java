class JaggedArrays
{
    public static void main(String args[])
    {
        int array[][] = new int[3][];
        array[0] = new int[] {1, 8, 2};
        array[1] = new int[] {3, 5};
        array[2] = new int[] { 9, 7, 9, 0 };
        
        System.out.println("Printing the jagged array: ");
        for(int i = 0; i < array.length; ++i)
        {
            for(int j = 0; j < array[i].length; ++j)
            {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}