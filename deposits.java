import java.util.*;
class deposits
{
    //data members
    int p,t,r;double si;
    public deposits()
    {
        p=1000;r=10;t=1;
    }
    public void input()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter principal");
        p=ob.nextInt();
        System.out.println("enter rate");
        r=ob.nextInt();
        System.out.println("enter term");
        t=ob.nextInt();
    }
    public void calc()
    {
        si=(p*r*t)/100;
    }
    public void display()
    {
        System.out.println("si= "+si);
    }
    public static void main()
    {
        deposits d1=new deposits();
        d1.input();d1.calc();d1.display();
    }
}
        
        
        