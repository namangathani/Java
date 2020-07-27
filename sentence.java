import java.io.*;
class sentence
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    String str;
    int n, maxch;

    sentence()
    {
        n=0;
        str="";
        maxch=256;

    }

    void input() throws IOException
    {

        System.out.print("Enter paragraph : ");
        str=(br.readLine()).toUpperCase();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='.'||ch=='?'||ch=='!')
            {
                n++;
            }
        }
        if(n==0||n>5)
        {
            System.out.println("You are allowed to enter upto  5 sentences only.");
        }
        else
        {
            System.out.println("Number of sentences: "+n);
        }
    }

    void display()
    {
        System.out.println("Alphabets"+"\t"+"Occurance");
    }

    void occurence()
    {
        int count[] = new int[maxch];
        int len = str.length();

        for (int i=0; i<len; i++)
        {
            count[str.charAt(i)]++;
        }
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++)
        {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++)
            {
                if (str.charAt(i) == ch[j] && str.charAt(i)!='.' && str.charAt(i)!='!' && str.charAt(i)!='?')  
                    find++;                
            }

            if (find == 1)  

                System.out.println(str.charAt(i)+"\t"+"\t"+count[str.charAt(i)]);            
        }
    }

    void main() throws IOException
    {
        sentence ob=new sentence();
        ob.input();
        ob.display();
        ob.occurence();
    }
}
