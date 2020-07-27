import java.util.*;
class TelephoneBill
{
    public static void main()
    {
        double mr=450,tb,nb,nc;
        Scanner ob=new Scanner (System.in);
        System.out.println("enter no. of calls");
        nc=ob.nextInt();
        if(nc<=25)
        {
            tb=450;
            System.out.println("the total bill is rs "+tb);
        }
        else if(nc<=75 && nc>=26)
        {
            tb=450+(nc-25)*1;
            System.out.println("the total bill is rs "+tb);
        }
        else if (nc<=175)
        {
            tb=450+75*1+(nc-75)*0.8;
            System.out.println("the total bill is rs  "+tb);
        }
        else if (nc<=200)
        {
            tb=450+75*1+175*0.8+(nc-175)*0.6;
            System.out.println("the total bill is rs  "+tb);
        }
        else
        {
            tb=450+75*1+175*0.8+200*0.6+(nc-200)*0.5;
            System.out.println("the total bill is rs  "+tb);
        }
        nb=tb*12.24/100;
        System.out.println("the net bill is "+nb);
       
    }
}
        
          