import java.util.*;
class Transport
{
    public static void main()
    {
        double nkms,b;
        Scanner ob=new Scanner (System.in);
        System.out.println("enter no. of km travelled");
        nkms=ob.nextDouble();
        if(nkms>=1 && nkms<=5)
        {
            b=nkms*5.5;
            System.out.println("the total bill is rs "+b);
        }
        else if (nkms<=15 && nkms>5)
        {
            b=5*5.5+nkms*4;
            System.out.println("the total bill is rs  "+b);
        }
        else if (nkms<=45 && nkms>15)
        {
            b=5*5.5+15*4+nkms-15*3.5;
            System.out.println("the total bill is rs  "+b);
        }
        else
        {
            b=5*5.5+15*4+30*3.5+nkms-30*3;
            System.out.println("the total bill is rs  "+b);
        }
       
    }
}
        
          