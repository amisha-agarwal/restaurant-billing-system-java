//interface concept applied
interface I1
{
    //interface holds abstract methods only
    abstract void menu_def();
}
//interface being implemented into a class
public class Menu implements I1
{
    //abstract class of interface defined in the class
    //menu_def class describes the menu items of restaurant
    public void menu_def()
    {
        System.out.println("\t\t 1.Fried Rice     |  \tRs.80/-");
        System.out.println("\t\t 2.French Fries   |  \tRs.120/-");
        System.out.println("\t\t 3.Idli Sambhar   |    \tRs.150/-");
        System.out.println("\t\t 4.Dosa           |  \tRs.150/-");
        System.out.println("\t\t 5.Pav Bhaji      |  \tRs.180/-");
        System.out.println("\t\t 6.Fried Idli     |  \tRs.180/-");

        System.out.println("\t\t\n\n PRESS 0 IF YOU WANT TO EXIT ");
    }
}
