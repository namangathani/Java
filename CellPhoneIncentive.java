import java.util.*;
class CellPhoneIncentive
{
    public static void main()
    {
        double cm=5000,us,amt,iamt;
        Scanner ob=new Scanner (System.in);
        System.out.println("enter no. of cell phones sold");
        us=ob.nextInt();
        amt=us*cm;
       if(us<=10)
        {
            System.out.println("no incentive");
        }
        else if (us>=11 && us<30)
        {
            iamt=amt-5.0/100*amt;
            System.out.println("the incentive amt is "+iamt);
        }
        else if (us>=30 && us<50)
        {
            iamt=amt-10.0/100*amt;
            System.out.println("the incentive amt is "+iamt);
        }
        else
        {
            iamt=amt-20.0/100*amt;
            System.out.println("the incentive amt is "+iamt);
        }
       
    }
}
        
          