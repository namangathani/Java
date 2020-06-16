import java.util.*;
class Future
{
    Scanner sc=new Scanner(System.in);
    int yy,mm,dd;
    int period;

    Future()
    {
        yy=0;
        dd=0;
        mm=0;
        period=0;
    }

    void read()
    {
        System.out.print("Enter Year : ");
        yy=sc.nextInt();
        System.out.print("Enter Month : ");
        mm=sc.nextInt();
        System.out.print("Enter Day : ");
        dd=sc.nextInt();
        System.out.print("Enter the period : ");
        period=sc.nextInt();
    }
    boolean valid()
    {
        int days[]={31, 28, 31, 30, 31, 30, 31, 30, 31, 30,31, 30};

        if((yy%4==0 && yy%100!=0)||(yy%400==0))
            days[1]++;
        if((mm>=1&&mm<=12)&&(dd>=1&&dd<=days[mm-1]))
            return true;
        else
            return false;
    }

    void futureDate()
    {
        int days[]={31, 28, 31, 30, 31, 30, 31, 30, 31, 30,31, 30};
        if((yy%4==0 && yy%100!=0)||(yy%400==0))
            days[1]++;
        int total=dd;
        int i=0;
        while(i<mm-1)
        {
            total+=days[i];
            i++;
        }
        total+=period-1;
        i=0;

        
        while(total>days[i])
        {
            total-=days[i];
            i++;
        }
        int nd=total;
        int nm=i+1;
        int ny=yy;

        System.out.println("Current Date : "+dd+"/"+mm+"/"+yy);
        System.out.println("Future Date : "+nd+"/"+nm+"/"+ny);
    }

    void main()
    {
        Future ob=new Future();
        ob.read();
        
            ob.futureDate();
        }
}