import java.util.*;
class CountHealthyThin
{
    public static void main()
    {
        int i,s=0,w,c=0;
        String nm;
        Scanner ob=new Scanner (System.in);
        for(i=1;i<=60;i++)
        {
            System.out.println("enter name");
            nm=ob.nextLine();
            System.out.println("enter weight");
            w=ob.nextInt();
            if(w>=60)
            {
                System.out.println("healthy");
                c++;
            }
            else
            {
                System.out.println("thin");
                c++;
            }
        }
        System.out.println(c);
    }
}
