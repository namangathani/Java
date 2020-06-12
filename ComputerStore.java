import java.util.*;
class ComputerStore
{
    // data members
    String buyerName;int itemPurchased; int qty,bill;
    //methods purchase(),calculateBill()
    public void purchase()
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Buyers Name");
        buyerName=ob.nextLine();
        System.out.println("1) HP LAPTOP 15 = Rs 34000");
        System.out.println("2) DELL LAPTOP XPS = Rs 44000");
        System.out.println("3) DELL LAPTOP INSPIRON = Rs 38000");
        System.out.println("4) DELL LAPTOP 3542 = Rs 45000");
        System.out.println("enter choice");
        itemPurchased=ob.nextInt();
        System.out.println("Enter quantity");
        qty=ob.nextInt();
    }
    public void calculateBill()
    {
        if(itemPurchased==1)
        bill=qty*34000;
        else if(itemPurchased==2)
        bill=qty*44000;
        else if(itemPurchased==3)
        bill=qty*38000;
        else if(itemPurchased==4)
        bill=qty*45000;
        else 
        System.out.println("invalid item purchased");
        System.out.println("BILL= "+bill);
    }
    public static void main()
    {
        ComputerStore c1=new ComputerStore();
        c1.purchase();
        c1.calculateBill();
    }
}

        
        
        