import java.util.*;
class AlternateCharacter
{
    public static void main()
    {
        int i,l;char c,ch; String n,s,s1=""; 
        Scanner ob=new Scanner(System.in);
        System.out.println("enter 2 sentences");
        n=ob.nextLine();
        s=ob.nextLine();
        l=n.length();
        for(i=0;i<l;i++)
        {
            c=n.charAt(i);
            ch=s.charAt(i);
            s1=s1+c;
            s1=s1+ch;
        }
        System.out.println(s1);
    }
}