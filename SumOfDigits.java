import java.util.*;
class SumOfDigits
{
    public static void main()
    {
        int i,n,r,s=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a no.");
        n=ob.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s+r;
        }
        System.out.println("sum= "+s);
    }
}