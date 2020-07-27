import java.util.*;
class Reverse
{
    public static void main()
    {
        int x,rev=0,r,n,y,i;
        Scanner ob=new Scanner(System.in);
        for (n=200;n<=225;n++)
        {
            y=reverse(n);
            System.out.println(y);
        }
        System.out.println("enter a no.");
        n=ob.nextInt();
        int n1=n;
        x=reverse(n);
        if(x==n1)
        System.out.println("palindrome no= "+n);
    }
    public static int reverse (int n)
    {
        int rev=0,r;
        while (n>0)
        {
            n=n/10;
            r=n%10;
            rev=rev*10+r;
        }
        return rev;
    }
}
        