import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>();


        // add elements
        list.add(5);
        list.add(2);
        list.add(4);

        System.out.println(list);

        //get elements

        int element = list.get(0);
        System.out.println(element);

        //add el in between
        list.add(1, 10);
        System.out.println(list);

        

        //remove elements

        list.remove(0);

        //Size
        System.out.println(list.size());

        //sorting for arrayList
        //need to import java.util.Collections

        Collections.sort(list);
        System.out.println(list);
        

    }
}
