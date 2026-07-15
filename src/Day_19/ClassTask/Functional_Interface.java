package Day_19.ClassTask;

import java.util.function.*;
import java.util.function.Predicate;
public class Functional_Interface {
    public static void main(String[] args) {
        Predicate<Integer> p  =(Integer n)->n%2==0;
        Supplier<Integer> s= ()->5;
        Function<String ,String> f  = (String str) -> str.toUpperCase();
        Function<String ,String>  m = (String str) -> str.toUpperCase();
        System.out.println(f.apply("Anu"));
        System.out.println(m.apply("Riya"));
        System.out.println( p.test(23));

    }

}