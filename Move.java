import java.util.*;
class Move
{
    String str;
    int pos;

    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        str=sc.next();
        System.out.println("Enter position to shift");
        pos=sc.nextInt();
    }

    void shift()
    {
        String temp="";
        if(pos<0)
        {
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch>='a'&&ch<='z')
                {
                    if((ch+pos)<97)
                        ch=(char)((int)ch+pos+26);
                    else
                        ch=(char)((int)ch+pos);
                }
                else if(ch>='A'&&ch<='Z')
                {
                    if((ch+pos)<65)
                        ch=(char)((int)ch+pos+26);
                    else
                        ch=(char)((int)ch+pos);
                }
                temp=temp+ch;
            }
            str=temp;
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch>='a'&&ch<='z')
                {
                    if((ch+pos)>122)
                        ch=(char)((int)ch+pos-26);
                    else
                        ch=(char)((int)ch+pos);
                }
                else if(ch>='A'&&ch<='Z')
                {
                    if((ch+pos)>90)
                        ch=(char)((int)ch+pos-26);
                    else
                        ch=(char)((int)ch+pos);
                }
                temp=temp+ch;
            }
            str=temp;
        }
        System.out.println(str);
    }

    void main()
    {
        Move ob=new Move();
        ob.read();
        ob.shift();
    }
}