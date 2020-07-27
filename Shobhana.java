import java.util.*;
class Shobhana 
{
    Scanner ob=new Scanner(System.in);
    int N;
    Shobhana()
    {
        N=0;
    }
    void readNum()
    {
        System.out.println("Enter a no.");
        N=ob.nextInt();
    }
    int square(int x)
    {
        int sr=(int)Math.sqrt(N);
        return sr;
    }
    int sumOfS(int x)
    {
        int sum=0;int num=N;
        while(num>0)
        {
            int rem=num%10;
            sum=sum+square(rem);
            num=num/10;
           
        }
        return sum;
    }
    void isShobhana()
    {
        int s=sumOfS(N);
        while(s>9)
        {
            s=sumOfS(s);
        }

        if(s==1)
        {
            System.out.println(N+" is a Shobhana No.");
        }
        else
            System.out.println(N+" is not a Shobhana No.");
    }
}