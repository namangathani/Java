import java.util.*;
class Panagram
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i; char ch; String s; boolean ans=true;
        System.out.println("enter a sentence");
        s=ob.nextLine();
        for(i='a';i<='z';i++)
        {
            ch=(char)i;
            if(s.indexOf(ch)==-1)
            {
                ans=false;break;
            }
        }
        if(ans==false)
        System.out.println("not a panagram");
    }
}