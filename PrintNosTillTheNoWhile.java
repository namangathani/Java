import java.util.*;
class PrintNosTillTheNoWhile
{
    public static void main()
    {
        int i=0,n;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a no.");
        n=ob.nextInt();
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}