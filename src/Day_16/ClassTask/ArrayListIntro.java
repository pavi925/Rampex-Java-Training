package Day_16.ClassTask;

import java.util.*;
public class ArrayListIntro {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("java");
        names.add(1,"python");

        names.add(2,"c++");
        names.add(3,"c");
        names.set(0,"Go");
        names.add("Ruby");
        names.add("ZZZ");
        System.out.println(names);
        Collections.sort(names);
        System.out.println("after sorting ...");

        System.out.println(names);

    }
}