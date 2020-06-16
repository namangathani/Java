import java.util.*;
class Factorial{  
    public static void main()
    {  
        int i,fact=1;  
        Scanner ob=new Scanner(System.in);
        int number= ob.nextInt();//It is the number to calculate factorial    
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);    
    }  
}  
