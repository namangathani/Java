import java.util.*;
class Anagram
{
    public static void main()
    {
        int i,l1,l2; char c; String s2,s1; boolean ans=true;
        Scanner ob=new Scanner (System.in);
        System.out.println("enter 2 sentences");
        s1=ob.nextLine();l1=s1.length();
        s2=ob.nextLine();l2=s2.length();
        for(i=0;i<l1;i++)
        {
            c=s1.charAt(i);
            if(s2.indexOf(c)==-1)
            {
                ans=false;break;
            }
        }
        for(i=0;i<l2;i++)
        {
            c=s2.charAt(i);
            if(s1.indexOf(c)==-1)
            {
                ans=false;break;
            }
        }
        if(ans==true)
        System.out.println("perfect anagram");
        else
        System.out.println("not a perfect anagram");
    }
}
        
        