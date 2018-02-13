package GL2;

import java.util.*;

public class GroceryList2 {
    private ArrayList<GroceryItemOrder2> indkøbsliste;

    public GroceryList2(){
        this.indkøbsliste = new ArrayList<>();
    }

    public void addItem(GroceryItemOrder2 item){
        indkøbsliste.add(item);
    }

    public int getTotaltCost(){

        int sum = 0;
        for (GroceryItemOrder2 vare : indkøbsliste){
            sum += vare.getCost();
        }
        return sum;
    }

    @Override
    public String toString() {
        return  "Items:" + indkøbsliste + "\n\nTotal price: " + getTotaltCost() + ".";
    }
}
