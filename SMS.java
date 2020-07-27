import java.io.*;

class SMS
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    String str, keys;

    SMS()
    {
        str="";
        keys="";
    }

    void input() throws IOException
    {
        System.out.print("Enter message : ");
        str=br.readLine();
    }

    void getKeys()
    {
        String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            for(int j=2;j<=9;j++)
            {
                for(int k=0;k<arr[j].length();k++)
                {
                    if(ch==arr[j].charAt(k))
                    {
                        int t=k+1;
                       
                        while(t!=0)
                        {
                            keys=keys+j;

                            t=t-1;
                        }
                    }
                }
            }
            if(ch==' ')
            keys=keys+"0";
        }
    }

    void frequency()
    {
       
        System.out.print("Frequency :  ");
        System.out.println("  Key"+"\t"+"Frequency");
        for(char ch='0';ch<'9';ch++)
        {
            int freq=0;
            for(int i=0;i<keys.length();i++)
            {
                if(keys.charAt(i)==ch)
                    freq=freq+1;
            }
            if(freq!=0)
                System.out.println("\t"+"\t"+ch+"\t"+" "+freq);
        }
    }

    void display()
    {
        System.out.println("Message : "+str);
        System.out.println("Keys : "+keys);
    }

    void main() throws IOException
    {
        SMS ob=new SMS();
        ob.input();
        ob.getKeys();
        ob.display();
        ob.frequency();
    }
}

