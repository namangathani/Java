import java.util.*;
class Dist
{
    Scanner sc=new Scanner(System.in);
    int feet, inch;

    Dist()
    {
        feet=0;
        inch=0;
    }

    void read()
    {
        System.out.print("Enter feet : ");
        feet=sc.nextInt();
        System.out.print("Enter inch : ");
        inch=sc.nextInt();
    }

    void Total(Dist d1, Dist d2)
    {
        inch=d2.inch+d1.inch;
        feet=d2.feet+d1.feet;
        if(inch>12)
        {
            inch-=12;
            feet++;
        }
    }

    void display()
    {
        System.out.println(feet+" ft "+inch+" in");
    }

    void main()
    {
        Dist d1 = new Dist();
        Dist d2 = new Dist();
        Dist total = new Dist();
        System.out.println("Enter first distance covered");
        d1.read();
        System.out.println("Enter second distance covered");
        d2.read();
        total.Total(d1,d2);
        System.out.print("Total distance covered is : ");
        total.display();
    }
}