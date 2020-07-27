import java.util.*;
class SumOfDigitsFunct
{
    public static void main()
    {
       int n,s=0;
       Scanner ob=new Scanner(System.in);
       System.out.println("enter a 2 or more digit no.");
       n=ob.nextInt();
       s=sumDigits(n);
       System.out.println("sum of the digits of the no.= "+s);
    }
    public static int sumDigits(int n)
    {
        int r,s=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s+r;
        }
        return s;
    }
}
       