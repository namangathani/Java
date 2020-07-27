import java.util.*;
class RomanNo
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int n;
        String wd[]={"I","II","III","IV","V","VI","VII","VIII","IX"};
        System.out.println("enter a no.");
        n=ob.nextInt();
        if(n>=1 && n<=9)
        {
            System.out.println(wd[n-1]);
        }
        else 
        {
            System.out.println("invalid");
        }
    }
}
        