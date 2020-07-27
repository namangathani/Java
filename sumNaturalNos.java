class sumNaturalNos
{
    public static void main()
    {
        int i,s=0;
        for(i=1;i<=100;i++)
        {
            if(i%3==0 && i%7==0)
            {
                s+=i;
            }
        }
        System.out.println(s);
    }
}
