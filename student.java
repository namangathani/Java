import java.util.*;
class student 
{
    //data members
    int rollno; String name,add; double mp,mc,mm,mb,tm,a;char g;
    //methods inputdata(),calresult(),showdata()
    public void inputdata()
    {
        Scanner ob=new Scanner (System.in);
        System.out.println("enter your name");
        name=ob.nextLine();
        System.out.println("enter your roll no.");
        rollno=ob.nextInt();
        System.out.println("enter your address");
        add=ob.next();
        System.out.println("enter marks in physics");
        mp=ob.nextDouble();
        System.out.println("enter marks in chemistry");
        mc=ob.nextDouble();
        System.out.println("enter marks in maths");
        mm=ob.nextDouble();
        System.out.println("enter marks in biology");
        mb=ob.nextDouble();
    }
    public void calresult()
    {
        tm=mp+mc+mm+mb;
        a=tm/4;
        if(a>=75)
        g='A';
        else if(a>=60)
        g='B';
        else
        g='C';
    }
    public void showdata()
    {
        System.out.println("total marks= "+tm);
        System.out.println("avg= "+a);
        System.out.println("grade= "+g);
    }
    public static void main()
    {
        student s1=new student();
        s1.inputdata();
        s1.calresult();
        s1.showdata();
    }
}
    