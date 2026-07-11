package Day_18.ClassTask;
import java.util.HashMap;
public class HashMapMarksGrading {
    public static void main(String [] args){
        HashMap<String,Integer> markList = new HashMap<String,Integer>();
        markList.put("Ravi",90);
        markList.put("Nane",95);
        markList.put("Pavi",80);
        markList.put("Ruby",90);
        for (String name : markList.keySet()) {
            int marks = markList.get(name);
            String grade;
            if (marks >= 90)
                grade = "A";
            else if (marks >= 80)
                grade = "B";
            else if (marks >= 70)
                grade = "C";
            else if (marks >= 60)
                grade = "D";
            else
                grade = "F";
            System.out.println(name + " : " + marks + " Grade = " + grade);
        }
    }
}
