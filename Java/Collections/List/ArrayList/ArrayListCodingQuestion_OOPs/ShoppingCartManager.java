package Collections.List.ArrayList.ArrayListCodingQuestion_OOPs;
/*
4. Shopping Cart Manager
Scenario: You're developing an e-commerce app. Users add and remove cart items dynamically.
Challenge: Manage items and compute total cost.
Arrays fall short: Arbitrary additions/removals are cumbersome.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCartManager
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\t\t\tWelcome to Shopping Cart Manager");
        System.out.println("------------------------------------------------------------------------");
        while(true)
        {
        System.out.println("Menu");
        System.out.println("1.Add Product");
        System.out.println("2.Remove Product");
        System.out.println("3.Checkout Product");
        System.out.println("4.Exit");
        System.out.println("------------------------------------------------------------------------");

            System.out.println("Enter Your Choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Adding Product");
                    System.out.println("Enter Product Name : ");
                    String name=sc.next();
                    System.out.println("Enter Product Price : ");
                    double price=sc.nextDouble();
                    cart.addItem(name,price);
                    System.out.println(name +"Added Successfully to cart");
                    System.out.println("------------------------------------------------------------------------");
                }
                break;

                case 2:
                {
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Removing Product");
                    System.out.println("Enter Product Name : ");
                    String name=sc.next();
                    cart.removeItem(name);
                    System.out.println(name +"Removed Successfully to cart");
                    System.out.println("------------------------------------------------------------------------");
                }
                break;

                case 3:
                {
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("CART");
                    System.out.println("Cart Items"+cart.items);
                    System.out.println("Total Amount : "+cart.totalPrice());
                    System.out.println("------------------------------------------------------------------------");
                }
                break;

                case 4:
                {
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Thank you Vidit Again!");
                    System.out.println("------------------------------------------------------------------------");
                    return;

                }
                default:
                {
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Invalid Choice");
                    System.out.println("------------------------------------------------------------------------");
                }
            }
        }
    }
}

class Item
{
    String name;
    double price;

    public Item(String name,double price)
    {
        this.name=name;
        this.price=price;
    }

    public String toString()
    {
        return "{ name : "+name+", Price : "+price+" }";
    }
}

class ShoppingCart
{
    ArrayList<Item> items=new ArrayList<>();
     public void addItem(String name,double price)
     {
         items.add(new Item(name,price));
     }

     public void removeItem(String name)
     {
         for(int i=0;i<=items.size()-1;i++)
         {
             if(items.get(i).name.equals(name))
             {
                 items.remove(i);
                 break;
             }
         }
     }

     public double totalPrice()
     {
         double total=0;
         for(Item i:items)
         {
             total=total+i.price;
         }
         return total;
     }



}
