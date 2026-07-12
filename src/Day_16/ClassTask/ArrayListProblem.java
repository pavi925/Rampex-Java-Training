package Day_16.ClassTask;

import java.util.*;
public class ArrayListProblem {
    public static void main(String[] args) {
        // Names: ["Alice", "Bob", "Charlie", "Diana", "Eve"]
        ArrayList<String> names = new ArrayList<>();
        names.add("charlie");
        names.remove("charlie");

        System.out.println(names);
    }
}