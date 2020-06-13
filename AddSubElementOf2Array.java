import java.util.*;
class AddSubElementOf2Array
{
    public static void main()
    {
        Scanner ob=new Scanner(System.in);
        int i;
        int a[]=new int [10];
        int b[]=new int [10];
        int c[]=new int [10];
        int d[]=new int [10];
        System.out.println("enter 10 nos");
        for(i=0;i<10;i++)
        {
            a[i]=ob.nextInt();
        }
        System.out.println("enter other 10 nos");
        for(i=0;i<10;i++)
        {
            b[i]=ob.nextInt();
        }
        for(i=0;i<10;i++)
        {
            c[i]=a[i]+b[i];
            d[i]=a[i]-b[i];
        }
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]+ "\t" +b[i]+ "\t" +c[i]+ "\t" +d[i]);
        }
        
    }}