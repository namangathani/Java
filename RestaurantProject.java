import java.util.*;
class RestaurantProject
{   
    
    
    public static void main()
    {
        String productsBoughtStr = "Sr. No.     Name                          Quantity       Total Price \n";
        
        Scanner ob=new Scanner(System.in);
        float totalPrice = 0;
        int totalQuantity = 0;
        int i=0;
        Boolean exit = false;
        
        showMenu();
        
        while(!exit) {
            
            int productNo,quantity;
            System.out.println("Enter product no. OR press any other number to print bill");
            productNo=ob.nextInt();
            float price = 0;
            if(productNo <=0 || productNo > 12) {
                exit = true;
                break;
            }
            
            System.out.println("Enter quantity");
            
            quantity=ob.nextInt();
            totalQuantity+=quantity;
            switch(productNo) {
                case 1: 
                price = (quantity*180);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Pasta in Arrabbianta Sauce       "+quantity+"             "+price+"\n";
                break;
                
                case 2: 
                price = (quantity*200);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Pasta in Alfredo Sauce           "+quantity+"             "+price+"\n";
                break;
                
                case 3: 
                price = (quantity*210);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Pasta in Salsa Rosa Sauce        "+quantity+"             "+price+"\n";
                break;
                
                case 4: 
                price = (quantity*230);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Pasta in Pesto Sauce             "+quantity+"             "+price+"\n";
                break;
                
                case 5: 
                price = (quantity*170);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Margherita Pizza                 "+quantity+"             "+price+"\n";
                break;
                
                case 6: 
                price = (quantity*180);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Classic Veggie Pizza             "+quantity+"             "+price+"\n";
                break;
                
                case 7: 
                price = (quantity*210);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Fire & Smoke Pizza               "+quantity+"             "+price+"\n";
                break;
                
                case 8: 
                price = (quantity*230);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Exotica Pizza                    "+quantity+"             "+price+"\n";
                break;
                
                case 9: 
                price = (quantity*230);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Risotto(cream and cheese)        "+quantity+"             "+price+"\n";
                break;
                
                case 10: 
                price = (quantity*230);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Risotto(sun dried)               "+quantity+"             "+price+"\n";
                break;
                
                case 11: 
                price = (quantity*230);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Risotto(pesto)                   "+quantity+"             "+price+"\n";
                break;
                
                case 12: 
                price = (quantity*250);
                totalPrice +=price;
                productsBoughtStr += (++i)+"           Lasagne                          "+quantity+"             "+price+"\n";
                break;
                
                default:
                System.out.println("Incorrect Value please try again.");
            }
        }
        
        
        productsBoughtStr += "\n----------------------------------------------------------------------------------------\n            Total Quantity: "+totalQuantity+"          Total: "+totalPrice;
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(productsBoughtStr);
        System.out.println();
        System.out.println("-----------------------------Thank you. Visit Again. -----------------------------------------");
        
        
        
        
        
    }
    
    /*
     * Show menu of all products
     */
    public static void showMenu() {
        System.out.println("****************** Naman's Restaurant ********************");
        System.out.println("********************* Food Menu **************************");
        System.out.println();
        System.out.println("1.  Pasta in Arrabbianta Sauce                    -  Rs. 180");
        System.out.println("2.  Pasta in Alfredo Sauce                        -  Rs. 200");
        System.out.println("3.  Pasta in Salsa Rosa Sauce                     -  Rs. 210");
        System.out.println("4.  Pasta in Pesto Sauce                          -  Rs. 230");
        System.out.println();
        System.out.println("5.  Margherita Pizza                              -  Rs. 170");
        System.out.println("6.  Classic Veggie Pizza                          -  Rs. 180");
        System.out.println("7.  Fire & Smoke Pizza                            -  Rs. 210");
        System.out.println("8.  Exotica Pizza                                 -  Rs. 230");
        System.out.println();
        System.out.println("9.  Risotto(cream and cheese)                     -  Rs. 230");
        System.out.println("10. Risotto(sun dried)                            -  Rs. 230");
        System.out.println("11. Risotto(pesto)                                -  Rs. 230");
        System.out.println("12. Lasagne                                       -  Rs. 250");
        System.out.println();
        System.out.println("*********************** END ******************************");
        System.out.println();
  
    }
    
}
       