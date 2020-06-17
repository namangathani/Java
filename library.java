import java.util.*;
class library
{
    //data members
    int acc_num; String title,author;
    //methods input(),compute(),display()
    public void input()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter accession no.");
        acc_num=ob.nextInt();
        System.out.println("enter title");
        title=ob.next();
        System.out.println("enter author");
        author=ob.next();
    }
    public void compute()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter no. of days late "); 
        int dayslate=ob.nextInt();
        int fine=2*dayslate;
        System.out.println("fine= "+fine);
    }
    public void display()
    {
        System.out.println("accession no= "+acc_num);
        System.out.println("title= "+title);
        System.out.println("author= "+author);
    }
    public static void main()
    {
        library l1=new library();
        l1.input();
        l1.compute();
        l1.display();
    }
}