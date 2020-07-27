import java.util.*;
class SumOfSeries2
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        double i,n,s=0;
        System.out.println("enter a no.");
        n=ob.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+Math.pow(i,2);
        }
        System.out.println(s);
    }
}

        