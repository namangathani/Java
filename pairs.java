import java.io.*;
class pairs
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int n, x, y;

    pairs()
    {
        n=0;
        x=0;
        y=0;
    }

    void input() throws IOException
    {
        System.out.print("Enter a number : ");
        n=Integer.parseInt(br.readLine());

        if(n<10||n>Math.pow(10,9))
        {
            System.out.println("Invalid input");
        }
    }

    void calc() throws IOException
    {
        for(int i=10;i<n;i++)
        {
            x=i;
            y=n-i;

            String str = Integer.toString(x);
            int len=str.length();
            for(int j=0;j<len;j++)
            {
                String t="";
                int k=0;
                if(j==0)
                {
                    t=str.substring(1);
                }
                else
                {
                    t=str.substring(0,j)+str.substring(j+1);
                }
                if(x+y==n)

                    k=Integer.parseInt(t);
                if(y==k)
                {
                    System.out.println(x+"+"+y+"="+n);
                    break;
                }
            }
        }
    }

    void main() throws IOException
    {
        pairs ob=new pairs();
        ob.input();
        ob.calc();
    }
}

