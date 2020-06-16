class isPrime
{
    public static void main()
    {
        int i; boolean f=false;
        for (i=1;i<=100;i++)
        {
            f=isPrime(i);
            if (f==true)
            {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int i)
    {
        int j,c=0;boolean f;
        for (j=1;j<=i;j++)
        {
            if (i%j==0)
            c++;
        }
        if(c==2)
        f=true;
        else
        f=false;
        return f;
    }
}