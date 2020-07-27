import java.util.*;
class SumOfSeries3
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        double i,x,n,s=0;
        System.out.println("enter a no.");
        x=ob.nextInt();
        System.out.println("enter a no.");
        n=ob.nextInt();
        for(i=0;i<=n;i++)
        {
            s=s+Math.pow(x,i);
        }
        System.out.println(s);
    }
}

        