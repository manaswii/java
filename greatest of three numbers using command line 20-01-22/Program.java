class Program
{
    public static void main(String args[])
    {
        if (args.length < 3)
        {
            System.out.println("Error: Please enter 3 command line arguments");
            return;
        }
        float a, b, c;
        a = Float.parseFloat(args[0]);
        b = Float.parseFloat(args[1]);
        c = Float.parseFloat(args[2]);

        if (a > b && a > c)
        {
            System.out.println(a + " is the biggest number");
        }
        else if (b > a && b > c)
        {
            System.out.println(b + " is the biggest number");
        }
        else if (c > a && c > b)
        {
            System.out.println(c + " is the biggest number");
        }
        else
        {
            System.out.println("No clear biggest number");
        }
    }
}