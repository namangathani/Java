import java.util.*;
class CountPosNegZero
{
    public static void main()
    {
        int i,n,c=0;
        Scanner ob=new Scanner (System.in);
        for(i=1;i<=10;i++)
        {
            System.out.println("enter a no.");
            n=ob.nextInt();
            if(n>1)
            {
                System.out.println("positive");
                c++;
            }
            else if(n<0)
            {
                System.out.println("negative");
                c++;
            }
            else
            {
                System.out.println("zero");
                c++;
            }
        }
        System.out.println(c);
    }
}
