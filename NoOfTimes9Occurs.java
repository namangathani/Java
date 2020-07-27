import java.util.*;
class NoOfTimes9Occurs
{
    public static void main()
    {
        long i,n,r,s,c=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a no.");
        n=ob.nextLong();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            if(r==9)
            c++;
        }
        System.out.println(c);
    }
}