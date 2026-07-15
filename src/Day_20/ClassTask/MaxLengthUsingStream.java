package Day_20.ClassTask;
import java.util.stream.Stream;
public class MaxLengthUsingStream {
    public static void main(String[] args){

    Stream<String> s = Stream.of("Ram","Seetha","Maha","Loki");
    System.out.println(s.map(n->n.length()).reduce(0,(a,b) -> a>b?a:b));
    }
}