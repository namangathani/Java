import java.util.*;
class AddSubMulDiv
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        double ch,s=0;int n1,n2;
        System.out.println("enter 2 nos.");
        n1=ob.nextInt();
        n2=ob.nextInt();
        System.out.println("1.add 2.subtract 3.multiply 4.divide");
        System.out.println("enter choice");
        ch=ob.nextDouble();
        if(ch==1)
        {
            s=add(n1,n2);
            System.out.println("the sum= "+s);
        }
        else if(ch==2)
        {
            s=sub(n1,n2);
            System.out.println("the difference= "+s);
        }
        else if (ch==3)
        {
            s=mul(n1,n2);
            System.out.println("the product= "+s);
        }
        else if (ch==4)
        {
            s=div(n1,n2);
            System.out.println("the quotient= "+s);
        }
    }

public static double add(int n1,int n2)
{
    double s=0;
    s=n1+n2;
    return s;
}
public static double sub(int n1,int n2)
{
    double s=0;
    s=n1-n2;
    return s;
}
public static double mul(int n1, int n2)
{
    double s=0;
    s=n1*n2;
    return s;
}
public static double div(int n1,int n2)
{
    double s=0;
    s=n1/n2;
    return s;
}
}
    