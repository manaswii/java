class PassingArrays
{
    static void printArray(int array[])
    {
        System.out.println();
        for (int i = 0; i < array.length; ++i) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    static int[] multiplyArrayBy2(int array[])
    {
        int newArray[] = new int[array.length];
        int multiplier = 3;

        for (int i = 0; i < array.length; ++i)
        {
            newArray[i] = multiplier * array[i];
        }
        return newArray;
    }
    public static void main(String args[])
    {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        printArray(array);
        System.out.println("Passing the array to a static method to multiply it by 3 and printing the new returned array: ");
        int newArray[] = multiplyArrayBy2(array);
        printArray(newArray);

    }
}