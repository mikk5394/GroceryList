package GL2;

import java.util.*;
import java.io.*;

public class Main2 {

    public static void main(String[] args) throws Exception {

        GroceryList2 indkøbsliste2 = new GroceryList2();
        Scanner sc = new Scanner(new File("src/GL2/Glist2"));
        while (sc.hasNextLine()){
            GroceryItemOrder2 item = new GroceryItemOrder2(sc.next(),sc.nextInt(),sc.nextInt());
            indkøbsliste2.addItem(item);
        }
        System.out.println(indkøbsliste2);
    }
}

