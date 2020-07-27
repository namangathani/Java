import java.util.*;
class SumOfNosDivisibleInRange
{
    public static void main()
    {
        int i,s=0,n;
        Scanner ob=new Scanner (System.in);
        for(i=1;i<=10;i++)
        {
            System.out.println("enter a no.");
            n=ob.nextInt();
            if(n%3==0 || n%7==0)
            {
                s=s+n;
            }
        }
        System.out.println(s);
    }
}
