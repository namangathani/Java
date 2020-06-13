import java.util.*;
class ArmstrongNo
{
    public static void main()
    {
        int x,n,r,s=0,n1;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a no.");
        n=ob.nextInt();
        n1=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            x=r*r*r;
            s=s+x;
        }
        if(s==n1)
        System.out.println("armstrong no.");
        else
        System.out.println("not an armstrong no.");
    }
}