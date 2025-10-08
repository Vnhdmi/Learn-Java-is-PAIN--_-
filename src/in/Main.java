package in;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentManager action = new studentManager();
        ArrayList<student> std = new ArrayList<>();
        get ip = new get();
        boolean run = true;

        do {
            System.out.println("""
                    1.Nhap thong tin hoc sinh 
                    2.In thong tin hien co 
                    3.Thoat chuong trinh
                    """);
            switch (sc.nextInt()) {
                case 1:
                    action.addStudent(std, ip.inputName(sc), ip.inputAge(sc), ip.inputAvg(sc));
                    break;
                case 2:
                    action.displayStuden(std);
                    break;
                case 3:
                    run = false;
                default:
            }

        } while (run);


    }
}
