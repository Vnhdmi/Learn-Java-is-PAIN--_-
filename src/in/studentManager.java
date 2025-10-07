package in;

import java.util.ArrayList;
import java.util.List;

public class studentManager {
    public void addStudent (ArrayList<student>arr , String name, int age, Double avgScore  ) {
        student s = new student(name,age,avgScore) ;
        arr.add(s);
    }
    public void displayStuden(ArrayList<student>arr ) {
        if (arr.isEmpty()) {
            System.out.println("Danh sanh trong ");
        }else {
            arr.stream().forEach(System.out::println);
        }
    }
}
