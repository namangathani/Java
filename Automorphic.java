import java.util.*;
public class Automorphic {
    Scanner sc = new Scanner(System.in);
    public int n;
    Automorphic()
    {
        n=0;
    }
    Automorphic(int x)
    {
        n=x;
    }
    void read()
    {
        System.out.print("Enter a no:");
        n=sc.nextInt();
    }
    int square(int n)
    {
        return n*n;
    }
    void check()
    {
        int n1= n;
        
        int divisor=1;
        while(n1!=0)
        {
            
           divisor= divisor*10;
           n1=n1/10;        
        }
        int sq= square(n);
        if(sq%divisor==n)
        {
            System.out.print("Automorphic");
            
        }
        else
        {
            System.out.print("not a automorphic");
        }
    }
    public static void main()
    {
        Automorphic obj = new Automorphic();
        obj.read();
        obj.check();
    }
    
}