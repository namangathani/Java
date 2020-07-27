import java.util.*;
class Scholarships
{
    public static void main()
    {
        double fees=150000,p,c,m,i,sa,avg,total;
        Scanner ob=new Scanner (System.in);
        System.out.println("enter marks in phy,chem,math,it");
        p=ob.nextInt();
        c=ob.nextInt();
        m=ob.nextInt();
        i=ob.nextInt();
        total=p+c+m+i;
        avg=total/4;
       if(avg>98)
        {
            sa=fees-100.0/100*fees;
            System.out.println("the scholarship amt is "+sa);
        }
        else if (avg>91 && avg<98)
        {
            sa=fees-90.0/100*fees;
            System.out.println("the scholarship amt is "+sa);
        }
        else if (avg>80 && avg<91)
        {
            sa=fees-50.0/100*fees;
            System.out.println("the scholarship amt is "+sa);
        }
        else if (avg>75 && avg<80)
        {
            sa=fees-25.0/100*fees;
            System.out.println("the scholarship amt is "+sa);
        }
        else
        {
            System.out.println("no scholarship");
        }
    }
}
        
          