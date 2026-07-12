package Day_16.ClassTask;

import java.util.*;
public class Comparison {
    public static void main(String[] args) {
        int times = 1000000;
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> li = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < times; i++) {
            al.add(i);
        }
        long end = System.nanoTime();
        System.out.println("Arraylist done in " + (end - start) / 10000 + " ms");
        long lstart = System.nanoTime();
        for (int i = 0; i < times; i++) {
            li.add(i);
        }
        long lend = System.nanoTime();
        System.out.println("LinkedList done in " + (lend - lstart) / 10000 + " ms");
    }
}



