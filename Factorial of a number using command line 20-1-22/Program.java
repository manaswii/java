class Program
{
    public static void main(String args[])
    {
        if (args.length != 1) {
            System.out.println("Please enter only one integer ");
            return;
        }
        System.out.println(factorial(Integer.parseInt(args[0])));
    }

    static int factorial(int num)
    {
        if (num == 1)
        {
            return 1;
        }
        else
        {
            return num * factorial(num - 1);
        }
    }
}