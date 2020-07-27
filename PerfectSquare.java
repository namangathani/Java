import java.util.*;
class PerfectSquare
{
    Scanner ob=new Scanner(System.in);
    int n;
    PerfectSquare()
    {
        n=0;
    }

    void divide()
    {
        for(int i=1;i<=n;i++)
        {
            int d=n/i;
            int sr=(int)Math.sqrt(d);
            if(sr*sr==d)
            {
                n=n/i;
                break;
            }

        }

    }

    void display(double r)
    {
        int sqr=(int)Math.sqrt(n);
        System.out.print("Square root of a no. is "+sqr);

    }
}