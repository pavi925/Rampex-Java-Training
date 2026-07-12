package Day_16.ClassTask;

import java.util.*;
public class ArrayList_vsLinkedList {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> testA());
        Thread t2 = new Thread(() -> testB());
        t1.start();
        t2.start();
    }
    public static void testA() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        System.out.println("added in Arraylist");
    }
    public static void testB() {
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list1.addLast(i);
        }
        System.out.println("added in Linked list");
    }
}
interface testable{
    public void run();
}