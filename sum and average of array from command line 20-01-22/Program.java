class Program
{
    public static void main (String args[])
    {
        float sum = 0, average = 0;
        for(int i = 0; i < args.length; ++i)
        {
            sum += Float.parseFloat(args[i]);
        }
        System.out.println("Sum of the array is: " + sum);
        average = sum / args.length;
        System.out.println("Average of array is: " + average);

    }
}