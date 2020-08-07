package Waiter;

import Kitchen.*;
import java.util.*;

public class Waiter {

    int choice, OrderNumber = 0, Quantity;
    String ItemName;
    float Price, totalPrice = 0;
    Scanner input = new Scanner(System.in);
    Queue<FoodItem> OrderQueue = new LinkedList<>();
    Queue<FoodItem> OrderedItems = new LinkedList<>();
    Kitchen K = new Kitchen();
    
    public float doWaiterJob() {
    totalPrice = 0;
    do{
        System.out.print("\n\nWAITER MENU:\n1. Take Order\n2. Check Availability of Order\n3. Place Bill\nEnter your Choice: ");
        choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("\nEnter Order Details:-");
                System.out.print("Item Name: ");
                ItemName = input.next() + input.nextLine();
                System.out.print("Quantity: "); 
                Quantity = input.nextInt();                   
                FoodItem F = new FoodItem(ItemName, Quantity);
                OrderQueue.add(F);
                OrderNumber++;
                System.out.println("\nYour Order has been Updated!");
                break;
            
            case 2:                    
                Queue<FoodItem> Available = K.checkItem(OrderQueue);
                String ch = new String("y");
                if(OrderQueue.size() != Available.size()) {
                    System.out.println("Unavailable Items:-");
                    Iterator<FoodItem> i = Available.iterator();
                    Iterator<FoodItem> j = OrderQueue.iterator();
                    FoodItem f1, f2;
                    while(i.hasNext()){
                        f1 = (FoodItem)i.next();
                        while(j.hasNext()) {
                            f2 = (FoodItem)j.next();
                            if(f1.ItemName != f2.ItemName) {
                                System.out.println(f2.ItemName);
                            }
                            else{
                                break;
                            }
                        }       
                    }
                    while(j.hasNext()) {
                        f2 = (FoodItem)j.next();
                        System.out.println(f2.ItemName);
                    }
                    System.out.println("Do you wish to place Order(y/n): ");
                    ch = input.next();
                }
                if(ch.equalsIgnoreCase("y")){
                    Available = K.cookedItems(Available);
                    Iterator<FoodItem> x = Available.iterator();
                    while(x.hasNext()) {
                        OrderedItems.add((FoodItem)x.next());
                    }
                    OrderQueue.clear();
                    System.out.println("\nOrder Placed!");
                }
                break;

            case 3: 
                System.out.println("\n\nItems/Quantity/Price");
                while(OrderedItems.size() != 0) {
                    totalPrice += OrderedItems.peek().Price * OrderedItems.peek().Quantity;
                    System.out.println(OrderedItems.peek().ItemName + "  " + OrderedItems.peek().Quantity + "  " + OrderedItems.peek().Quantity*OrderedItems.peek().Price);
                    OrderedItems.remove();
                }
                return (totalPrice);

            default:
                System.out.println("\nWrong Choice Entered!");
                break;
        }
    }while(choice != 3);
    return (totalPrice);
    }
}
