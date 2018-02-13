package GL1;

import java.util.*;

public class GroceryList {
    private GroceryItemOrder[] groceryList = new GroceryItemOrder[10];

    public void addItem(GroceryItemOrder item){
        for (int i = 0; i < groceryList.length; i++){
            if (groceryList[i] == null){
                groceryList[i] = item;
                break;
            }
        }
    }

    public double getTotalCost(){

        double sum = 0;
        for (int i = 0; i < groceryList.length; i++){
            if (groceryList[i] != null){
                sum += groceryList[i].getCost();
            }
        } return sum;
    }

    @Override
    public String toString() {
        return "Items: " + Arrays.toString(groceryList) + "\n\nTotal price: " + getTotalCost() + ".";
    }
}
