package Day_16.ClassTask;

import java.util.LinkedList;
public class LinkedListTest {
    public static void main(String [] arg){
        LinkedList<Integer> list= new LinkedList<Integer>();
        list.add(5);
        list.add(7);
        list.add(null);
        list.remove(null);
        System.out.println(list);
    }
}