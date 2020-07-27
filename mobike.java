import java.util.*;
class mobike
{
    // data members
    int bno,phno=0,days,charge; String name;
    //methods input(),computer(),display()
    public void input()
    {
        Scanner ob=new Scanner (System.in);
        System.out.println("enter your name");
        name=ob.next();
        System.out.println("enter your phone no.");
        phno=ob.nextInt();
        System.out.println("enter your bike no.");
        bno=ob.nextInt();
        System.out.println("enter no. of days for rent");
        days=ob.nextInt();
    }
    public void computer()
    {
        if(days<=5)
        {
            charge=500*days;
        }
        else if(days<=10)
        {
            charge=5*500+(days-5)*400;
        }
        else
        {
            charge=5*500+5*400+(days-10)*200;
        }
    }
    public void display()
    {
        System.out.println("bike no. "+bno);
        System.out.println("phone no= "+phno);
        System.out.println("no. of days for bike rent= "+days);
        System.out.println("charge to pay= "+charge);
    }
    public static void main()
    {
        mobike m1=new mobike();
        m1.input();
        m1.computer();
        m1.display();
    }
   
}
