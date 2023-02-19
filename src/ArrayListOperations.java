//Operations on ArrayList - Array List - In Class


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        insert(list,45);
        insert(list,90);
        insert(list,60);

        DecOrder(list);
        System.out.println(list);

        Search(list,91);
    }
    public static void insert(ArrayList<Integer> list, int x)
    {
        // Your code here
        list.add(x);
    }

    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.sort(list);
    }

    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        // Your code here
        int result = -1;
        int index = 0;
        while(index < list.size()) {
            int element = list.get(index);
            if(element == val){
                result = index;
                break;
            }
            index++;
        }

        System.out.print(result);
    }

    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
        // Your code here
        Collections.sort(list,Collections.reverseOrder());
    }
}
