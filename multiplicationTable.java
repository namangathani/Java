import java.util.*;
class multiplicationTable
{
    public static void main()
    {
        int i,n,m,p;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a no.");
        n=ob.nextInt();
        System.out.println("till what multiple");
        p=ob.nextInt();
        for(i=1;i<=p;i++)
        {
            m=n*i;
            System.out.println(n+"x"+i+"="+m);
        }
    }
}
