package GL1;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        GroceryList indkøbsliste = new GroceryList();

        Scanner sc = new Scanner(new File("src/GL1/Glist"));
        while (sc.hasNextLine()){
            GroceryItemOrder item = new GroceryItemOrder(sc.next(),sc.nextDouble(),sc.nextInt());
            indkøbsliste.addItem(item);
        }
        /*
        GroceryList indkøbsliste = new GroceryList();
        GroceryItemOrder mælk = new GroceryItemOrder("mælk", 10, 2);
        GroceryItemOrder kylling = new GroceryItemOrder("kylling", 30, 1);
        GroceryItemOrder vand = new GroceryItemOrder("vand", 8, 3);

        indkøbsliste.addItem(mælk);
        indkøbsliste.addItem(kylling);
        indkøbsliste.addItem(vand);
        */
        System.out.println(indkøbsliste);
    }
}
