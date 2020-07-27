import java.util.*;
class NameAsManyTimesAsAge
{
    public static void main()
    {
        int i,a;
        String nm;
        Scanner ob=new Scanner (System.in);
        System.out.println("enter name");
        nm=ob.nextLine();
        System.out.println("enter age");
        a=ob.nextInt();
        for(i=1;i<=a;i++)
        {
            System.out.println(nm);
        }
    }
}
        