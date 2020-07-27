import java.util.*;
class number 
{
    // data members 
       double n1,n2,sum=0,diff=0,prod=0;
    // methods  inputValues(),calculate(),display()
    public void inputValues()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter 2 nos.");
        n1=ob.nextDouble();
        n2=ob.nextDouble();
    }
    public void calculate()
    {
        sum=n1+n2;
        if(n1>n2)
        {
            diff=n1-n2;
        }
        else
        {
            diff=n2-n1;
        }
        prod=n1*n2;
    }
    public void display()
    {
        System.out.println("sum= "+sum);
        System.out.println("difference= "+diff);
        System.out.println("product= "+prod);
    }
    public static void main()
    {
        number n3=new number();
        n3.inputValues();
        n3.calculate();
        n3.display();
    }
}