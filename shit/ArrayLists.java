package shit;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        /*
        Arraylist is just a ds which don't have a specific size and can add unlimited items f
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 10);
        System.out.println(list);  // u can print arraylist just like that ^_^

//        // arraylist functions
//        list.add(1);  // too easy
//        list.add(2, 0);  // can add items at specific index
        list.get(0);  // to get index of specific index
////        list.clear();  // to remove all items
//        list.contains(2);  // check if arraylist contains this element or not , returns boolean type value
//        list.set(0, 21);  // replaces item with given item with specified index -- .set(index, item)
//        list.remove(2);  // can remove both items and items on given index

    }
}
