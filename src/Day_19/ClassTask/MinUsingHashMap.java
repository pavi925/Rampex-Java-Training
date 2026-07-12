package Day_19.ClassTask;
import java.util.HashMap;
import java.util.Map;
public class MinUsingHashMap {
    public static void main(String [] args){
        HashMap<String ,Integer> hm = new HashMap<String ,Integer>();
        hm.put("Sibi",90);
        hm.put("thara",80);
        hm.put("Anu",75);
        hm.put("Vasu",85);
        int min = 105;
        String name = "";
        for(Map.Entry<String,Integer> e: hm.entrySet()){
            if(e.getValue() < min){
                min = e.getValue();
                name = e.getKey();
            }
        }
        System.out.println(min);
        System.out.println(name);
    }
}
