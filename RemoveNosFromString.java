import java.util.*;
class RemoveNosFromString
{
    public static void main()
    {
        int i,l;char c; String n,s1=""; 
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a sentence");
        n=ob.nextLine();
        l=n.length();
        for(i=0;i<l;i++)
        {
            c=n.charAt(i);
            if(Character.isDigit(c)==true)
            continue;
            else 
            s1=s1+c;
        }
        System.out.println(s1);
    }
}