import java.util.*;
class Time
{
    Scanner sc=new Scanner(System.in);
    int hh,mm,ss;

    Time()
    {
        hh=0;
        mm=0;
        ss=0;
    }

    void readTime()
    {
        System.out.print("Enter hour : ");
        hh=sc.nextInt();
        System.out.print("Enter minute : ");
        mm=sc.nextInt();
        System.out.print("Enter second : ");
        ss=sc.nextInt();
    }

    void interval(Time t1,Time t2)
    {
        if(t1.ss>t2.ss)
        {
            t2.ss+=60;
            t2.mm--;
        }
        if(t1.mm>t2.mm)
        {
            t2.mm+=60;
            t2.hh--;
        }
        ss=t2.ss-t1.ss;
        mm=t2.mm-t1.mm;
        hh=t2.hh-t1.hh;
    }
    void display()
    {
        System.out.println(hh+":"+mm+":"+ss);
    }
    public static void main()
    {
        Time login = new Time();
        Time logout = new Time();
        Time total = new Time();
        System.out.println("Enter log-in time");
        login.readTime();
        System.out.println("Enter log-out time");
        logout.readTime();
        total.interval(login,logout);
        total.display();
    }
}