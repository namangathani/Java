import java.util.*;
class EvenDigitsOfNo
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
            if(r%2==0)
            System.out.println(r);
        }
    }
}