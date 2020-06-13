import java.io.*;
class CyberCafeManagement
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int uid, hh, mm, DD, MM, max;

    CyberCafeManagement()
    {
        uid=0;
        hh=0;
        mm=0;
        DD=0;
        MM=0;
        max=100;
    }

    void get() throws IOException
    {
        System.out.print("Enter user identification number : ");
        uid=Integer.parseInt(br.readLine());
        System.out.println("TIME(Enter in 24hr format)-");
        System.out.print("Enter hour : ");
        hh=Integer.parseInt(br.readLine());
        System.out.print("Enter minute : ");
        mm=Integer.parseInt(br.readLine());
        System.out.println("DATE-");
        System.out.print("Enter Day: ");
        DD=Integer.parseInt(br.readLine());
        System.out.print("Enter Month : ");
        MM=Integer.parseInt(br.readLine());

    }

    void calc(CyberCafeManagement A, CyberCafeManagement B)
    {
        if(B.DD>A.DD)
        {
            B.hh+=24*(B.DD-A.DD);

            int h=B.hh-A.hh;
            int m=B.mm-A.mm;

            if(m>=60)
            {
                h+=m/60;
                m=m%60;
            }
        }

        if(B.hh<A.hh)
        {

            B.hh+=24;
        }
        if(B.mm<A.mm)
        {
            B.mm+=60;
            B.hh--;
        }

        int m=B.mm-A.mm;
        int h=B.hh-A.hh;

        System.out.println("USER\t\tLOGIN\t\tLOGOUT\t\tDURATION");
        System.out.println("IDENTIFICATION\tTIME & DATE\tTIME & DATE\tHOURS:MINUTES");
        System.out.println("\t"+A.uid+"\t"+A.hh+":"+A.mm+"\t"+A.DD+"-"+A.MM+"\t"+B.hh+":"+B.mm+"\t"+B.DD+"-"+B.MM+"\t"+h+":"+m);

    }

    void main() throws IOException
    {
        System.out.print("Enter number of users: ");
        int n=Integer.parseInt(br.readLine());
        if(n>max)
        {
            System.out.println("Only 100 users can log in at a time.");
        }
        else
        {

            CyberCafeManagement ob[][]=new CyberCafeManagement[n][2];

            for(int i=0;i<n;i++)
            {
                ob[i][0]=new CyberCafeManagement();
                System.out.println("LOGIN DETAILS:");
                ob[i][0].get();
                ob[i][1]=new CyberCafeManagement();
                System.out.println("LOGOUT DETAILS:");
                ob[i][1].get();

                calc(ob[i][0],ob[i][1]);
            }
        }
    }
}

