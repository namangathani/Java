import java.util.*;
class HottestColdestCity
{
    public static void main()
    {
        String n[]={"mumbai","nagpur","pune","ahmedabad","delhi","chennai","jaipur","kochi","surat","kanpur"};
        double t[]={22,23,24,25,26,28,24.5,28.5,29,27.5};
        double s=0,avg=0,max=t[0],mxpos=0,min=t[0],mnpos=0;
        int i,pos=-1,posn=-1,post=-1;
        String x;
        Scanner ob=new Scanner(System.in);
        for(i=0;i<=9;i++)
        {
           s=s+t[i];
        }
        avg=s/10;
        System.out.println("avg temp=  "+avg);
        System.out.println("enter city name");
        x=ob.nextLine();
        for(i=0;i<10;i++)
        {
            if(x==n[i])
            {
                pos=i;
                break;
            }
        }
        if(pos==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("temp= "+t[pos]);
        }
        for(i=0;i<10;i++)
        {
            if(t[i]>max)
            {
                max=t[i];
                posn=i;
                break;
            }
        }
        System.out.println("hottest city=  "+n[posn]);
        for(i=0;i<10;i++)
        {
            if(t[i]<min)
            {
                min=t[i];
                post=i;
                break;
            }
        }
        System.out.println("coldest city=  "+n[post]);
        
            
        
    }
}