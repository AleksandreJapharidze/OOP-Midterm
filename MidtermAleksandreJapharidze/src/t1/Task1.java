package t1;
import java.util.ArrayList;
import java.util.List;

/**
 * This program demonstrates how to create a third list (list3) by using values
 * from an integer list (list1) to select elements from a string list (list2).
 *
 * Each value in list1 represents an index (starting from 1) into list2.
 * The program subtracts 1 from each list1 element to get the correct 0-based index
 * and adds the corresponding element from list2 to list3.
 *
 * Example:
 * If list1 contains the value 3, the program accesses list2 at index 2 and adds that element to list3.
 *
 * The result is a list of strings (list3) constructed by mapping integer positions to string values.
 */

public class Task1 {
/**
 * The main method initializes two lists:
 * - list1: a list of integers representing 1-based positions.
 * - list2: a list of strings to choose from.
 *
 * It then creates list3 by selecting elements from list2 using values from list1 (after adjusting for 0-based indexing).
 * Finally, it prints all three lists.
 *
 */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(1);
        list1.add(9);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(7);
        list1.add(10);
        list1.add(6);
        list1.add(8);

        List<String> list2 = new ArrayList<>();
        list2.add("fys");
        list2.add("ibx");
        list2.add("ene");
        list2.add("fqu");
        list2.add("ddb");
        list2.add("pcs");
        list2.add("ise");
        list2.add("aum");
        list2.add("onp");
        list2.add("phb");
        list2.add("iud");
        list2.add("avm");

        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            int index = list1.get(i) - 1;
            if (index >= 0 && index < list2.size()) {
                list3.add(list2.get(index));
            }
        }

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);
    }
}