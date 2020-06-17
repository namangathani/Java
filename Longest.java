import java.util.*;
class Longest
{
    Scanner sc=new Scanner(System.in);
    String str;

    Longest()
    {
        str="";
    }

    void read()
    {
        System.out.println("Enter  sentence : ");
        str=sc.nextLine();
    }

    int count()
    {
        int count=1;
        for(int i=0;i<str.length();i++)  
        {  
            char ch= str.charAt(i);  
            if( ch==' ' )  
                count=count+1;  
        }  
        return count;  
    }  

    String longWord()
    {
        String max="";
        str+=" ";
        int l=0;
        int p=0;
        String temp="";
        int t=0;
        for(int i=0;i<str.length();i++)
        {
            char b=str.charAt(i);
            if(b!=' ')
            {
                temp+=b;
                t++;
            }
            else
            {
               
                if(t>l)
                {
                    max=temp;
                    l=t;
                }
                else if(t==l)
                {
                    if(temp.compareTo(max)<0)
                    {
                        max=temp;
                        l=t;

                    }
                }
                temp="";
                t=0;
            }
        }

        return max;
    }

    public static void main()
    {
        Longest ob=new Longest();

        ob.read();
        int r=ob.count();
        System.out.println("Number of words in sentence is = "+r);
        String m=ob.longWord();
        System.out.print("The longest word is =  "+m);            

    }
}


