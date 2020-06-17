import java.util.*;
class loopclass
{
    //data members 
    String presult,aresult;int n,n1,i,c,s=0;
    public loopclass()
    {
        presult="";aresult="";
    }
    public void input()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a no.to check for prime or armstrong");
        int n=ob.nextInt();
    }
    public void prime()
    {
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
               c++;
            }
        }
        if(c==2)
        {
           presult="prime";
           System.out.println(presult);
        }
        else 
        {
            presult="notprime";
            System.out.println(presult);
        }
    }
    public void arms()
    {
        int n1=n;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            s=s+r*r*r;
        }
        if(s==n1)
        {
            aresult="armstrong";
            System.out.println(aresult);
        }
        else
        {
            aresult="notarmstrong";
            System.out.println(aresult);
        }
    }
    public static void main()
    {
        loopclass l1=new loopclass();
        l1.input();l1.prime();l1.arms();
    }
}

        
        