class SumNosDivisibleBy3N7
{
    public static void main()
    {
        int i,c=0;
        for(i=1;i<=100;i++)
        {
            if(i%3==0 && i%7==0)
            {
                c=c+i;
            }
        }
        System.out.println(c);
    }
}
