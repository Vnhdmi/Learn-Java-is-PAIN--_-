package in;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentManager {
    public void addStudent(ArrayList<student> arr) {
        Scanner sc = new Scanner(System.in);
        get in = new get();
        student s = new student(in.inputName(sc), in.inputAge(sc), in.inputAvg(sc));
        arr.add(s);
    }

    public void displayStuden(ArrayList<student> arr) {
        if (arr.isEmpty()) {
            System.out.println("Danh sanh trong ");
        } else {
            arr.stream().forEach(System.out::println);
        }
    }
}
