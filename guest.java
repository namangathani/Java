import java.util.*;
class guest
{
    //data members 
    String n,add;int nod,t;double ba,d,nb;
    public guest()
    {
        t=3000;
    }
    public guest(int ta)
    {
        ta=t;
    }
    public void input()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter your name");
        n=ob.next();
        System.out.println("enter your address");
        add=ob.next();
        System.out.println("enter no. of days");
        nod=ob.nextInt();
    }
    public void calc()
    {
        if(nod<=5)
        {
            ba=t;
        }
        else if(nod>5)
        {
            ba=t-(10.0/100*t);
        }
    }
    public void display()
    {
        System.out.println("bill amt= "+ba);
    }
    public static void main()
    {
        guest g1=new guest();
        g1.input();
        g1.calc();
        g1.display();
        guest g2=new guest(7500);
        g2.input();
        g2.calc();
        g2.display();
    }
}
        