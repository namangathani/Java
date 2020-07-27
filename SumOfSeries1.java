import java.util.*;
class SumOfSeries1
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        double i,n,s=0;
        System.out.println("enter a no.");
        n=ob.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+(i*i+1);
        }
        System.out.println(s);
    }
}

        