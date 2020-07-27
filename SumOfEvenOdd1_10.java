class SumOfEvenOdd1_10
{
    public static void main()
    {
        int i=2,j=1,s=0;
        while(i<=10)
        {
            i+=2;
        }
        s=s+i;
        System.out.println("sum of all even nos.= "+i);
        while(j<=10)
        {
            j+=2;
        }
        s=s+j;
        System.out.println("sum of all odd nos.="+s);
            
    }
}