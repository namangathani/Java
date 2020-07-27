import java.util.*;
class MonthNo
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int n;
        String wd[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
        System.out.println("enter a no.");
        n=ob.nextInt();
        if(n>=1 && n<=12)
        {
            System.out.println(wd[n-1]);
        }
        else 
        {
            System.out.println("invalid");
        }
    }
}
        