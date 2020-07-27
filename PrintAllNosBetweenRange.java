import java.util.*;
class PrintAllNosBetweenRange
{
    public static void main()
    {
        int i,n,m;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter 2 nos");
        n=ob.nextInt();
        m=ob.nextInt();
        for(i=n;i<m;i++)
        {
            System.out.println(i);
        }
    }
}

        