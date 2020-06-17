import java.util.*;
class LastNameWithInitials
{
    public static void ex1()
    {
        Scanner ob=new Scanner (System.in);
        int i; char c; String s;
        System.out.println("enter your first,middle and last name");
        s=ob.nextLine();s=s.trim();
        int x=s.indexOf(' ');
        int y=s.lastIndexOf(' ');
        System.out.print(s.charAt(0)+" ");
        System.out.print(s.charAt(x+1)+" ");
        System.out.print(s.substring(y+1));
    }
    public static void ex2()
    {
        Scanner ob=new Scanner (System.in);
        int i; char c; String s;
        System.out.println("enter your first,middle and last name");
        s=ob.nextLine();s=s.trim();
        int x=s.indexOf(' ');
        int y=s.lastIndexOf(' ');
        System.out.print(s.substring(y+1)+" ");
        System.out.print(s.charAt(0)+" ");
        System.out.print(s.charAt(x+1));
    }
    public static void ex3()
    {
        Scanner ob=new Scanner (System.in);
        int i; char c; String s;
        System.out.println("enter your first,middle and last name");
        s=ob.nextLine();s=s.trim();
        int x=s.indexOf(' ');
        int y=s.lastIndexOf(' ');
        System.out.print(s.charAt(0)+" ");
        System.out.print(s.charAt(x+1)+" ");
        System.out.print(s.charAt(y+1));
    }
}
        
        
        
    