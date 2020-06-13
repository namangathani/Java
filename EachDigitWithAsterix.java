import java.util.*;
class EachDigitWithAsterix
{
    public static void main()
    {
        int i,n,r;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a no.");
        n=ob.nextInt();
        while(n>0)
        {
            r=n%10;
            n=n/10;
            System.out.println("*"+r);
           
        }
    }
}