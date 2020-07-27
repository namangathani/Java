class NoSquareCube1_20 
{
    public static void main()
    {
        int i;
        for (i=1;i<=20;i++)
        {
            System.out.print(i + " ");
            System.out.print((int)Math.pow(i,2)+ " ");
            System.out.println((int)Math.pow(i,3)+ " ");
        }
    }
}