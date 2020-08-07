package Kitchen;

import Waiter.*;

import java.util.*;
import java.lang.Thread;

class cookTime implements Runnable{                // MULTI THREADING


    @Override
    public void run() {
        System.out.println ("Your Food is getting cooked!!\nThread " + 
                                Thread.currentThread().getId() + 
                                " is running"); 

    }
    
}

public class Kitchen implements foodMenu,searchMenu{

    public Queue<FoodItem> checkItem(Queue<FoodItem> OrderQueue){
        Queue<FoodItem> Available = new LinkedList<>();
        Stack<FoodItem> Unavailable = new Stack<>();
        Iterator<FoodItem> i = OrderQueue.iterator();
        FoodItem F;

        while(i.hasNext()){
            F = (FoodItem)i.next();
            if(foodMenu.containsKey(F.ItemName)){
                FoodItem AF = new FoodItem(F.ItemName, F.Quantity, foodMenu.get(F.ItemName));
                Available.add(AF);
            }
            else{
                FoodItem UAF = new FoodItem(F.ItemName);
                Unavailable.push(UAF);
            }
        }
        return Available; 
    }

    public Queue<FoodItem> cookedItems(Queue<FoodItem> Available){

        for(int i=0;i<=4;i++){
            Thread object = new Thread(new cookTime()); 
            object.start(); 
        }
        System.out.println("\n\nFood Prepared!!");
        return Available;
    }
    
}