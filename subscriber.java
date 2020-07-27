import java.util.*;
class subscriber
{
    //data members
    int sid,n; String sname;double bill,netbill;
    //methods inputdata(),calbill(),show()
    public void inputdata()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter subscriber id");
        sid=ob.nextInt();
        System.out.println("enter subscriber name");
        sname=ob.next();
        System.out.println("enter no. of calls ");
        n=ob.nextInt();
    }
    public void calbill()
    {
        if(n<=100)
        bill=350;
        else if(n<=150)
        bill=350+(n-100)*1;
        else if(n<=225)
        bill=350+50*1+(n-150)*0.75;
        else
        bill=350+50*1+75*0.75+n*0.50;
        netbill=bill+(12.36/100*bill);
    }
    public void show()
    {
        System.out.println("bill= "+netbill);
    }
    public static void main()
    {
        subscriber s1=new subscriber();
        s1.inputdata();
        s1.calbill();
        s1.show();
    }
}
        