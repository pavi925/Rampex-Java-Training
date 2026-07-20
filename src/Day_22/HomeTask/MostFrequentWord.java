package Day_22.HomeTask;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Scanner;
public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence:");
        String sentence =sc.nextLine();
        Map<String, Long> map = Arrays.stream(sentence.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        Map.Entry<String, Long> result = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();
        System.out.println(result.getKey() + " -> " + result.getValue());
    }
}