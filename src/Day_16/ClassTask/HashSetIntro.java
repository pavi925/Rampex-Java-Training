package Day_16.ClassTask;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetIntro {
    public static void main(String[] args) {
        HashSet<Character> h = new HashSet<>();
        for (int i = 0; i <= 1000; i++) {
            h.add(Character.valueOf((char) i));
        }

        System.out.println(h);
    }
}