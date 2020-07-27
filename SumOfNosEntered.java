import java.util.*;
class SumOfNosEntered
{
    public static void main()
    {
        int i,s=0,n=0;
        Scanner ob=new Scanner (System.in);
        for(i=1;i<=10;i++)
        {
            System.out.println("enter a no.");
            n=ob.nextInt();
            s+=n;
        }
        System.out.println(s);
    }
}
