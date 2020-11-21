//predefined java packages imported
import java.util.*;

//Restaurant class inherits the properties of Menu class
//inheritance concept applied
public class Restaurant extends Menu
{
    // default constructor of class defined
    //constructors are called automatically when objects are created
    Restaurant()
    {
        System.out.println("\t-------------------------------------");
        System.out.println("\t\t** Restaurant Bill System ** ");
        System.out.println("\t-------------------------------------");
    }
    public void bill_generate(int amt,int qty)
    {
        amt = amt*qty;
    }

    //driver class defined
    public static void main(String [] args)
    {
        //object of scanner class created to reads input from user
        Scanner sc = new Scanner(System.in);
        //object of Restaurant class created
        Restaurant obj1 = new Restaurant();
        //interger variables defined for calculations
        int amt,payment=0;
        //count variable to count the no. of items ordred
        int count =0;
        char s='y';
        //while loop applied untill customer has ordered the food
        while(s=='Y'||s=='y')
        {
            //method of Menu class called
            obj1.menu_def();
            System.out.println("\t\tEnter the item you want to order");
            //choice read from user
            int choice = sc.nextInt();
            System.out.println("\t\tEnter the Quantity you want to order =");
            //quantity read from user
            int qty = sc.nextInt();
            //switch case applied with the choice as parameter in it.
            switch (choice)
            {
                case 0:
                {
                    System.out.println("Total bill ="+ payment);
                    break;
                }
                // Fried Rice = Rs.80/-
                case 1:
                {
                    amt = 80;
                    payment = payment+(amt*qty);
                    count = count + qty;
                    break;
                }
                // French Fries = Rs.120/-
                case 2:
                {
                    amt = 120;
                    payment = payment+(amt*qty);
                    count = count + qty;
                    break;
                }
                // Idli Sambhar = Rs.150/-
                case 3:
                    // Dosa = Rs.150/-
                case 4: {
                    amt = 150;
                    payment = payment+(amt*qty);
                    count = count + qty;
                    break;
                }
                // Pav Bhaji = Rs.180/-
                case 5:
                {
                    amt = 180;
                    payment = payment+(amt*qty);
                    count = count + qty;
                    break;
                }
                // Fried Idli = Rs.180/-
                case 6:
                {
                    amt = 180;
                    payment = payment+(amt*qty);
                    count = count + qty;
                    break;
                }
                default:
                {
                    System.out.println("Sorry you have entered wrong choice .");
                }
            }
            //enter 'y' or 'Y' to again enter your choice.
            System.out.println("\t\tDo you want to order anything else ? (Yes/No) ");
            //character read from user
            s = sc.next().charAt(0);
        }
        System.out.println("\t-----------------------------");
        System.out.println("\t\t*** Generated Bill ***");
        System.out.println("\t-----------------------------");
        System.out.println("\t\tTotal Item = "+count);
        System.out.println("\t\tAmount to be payed = "+payment);
        //finalize method called to dispose off all the objects created
        obj1.finalize();
    }
    //finaloze method overridden to dispose of all the objects
    protected void finalize()
    {
        System.out.println("\t\t**THANK YOU**\t\t **VISIT AGAIN**");
    }
}
