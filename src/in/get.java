package in;

import java.util.Scanner;

public class get {
    public  String inputName(Scanner sc) {
        String name = "";
        String regexName = "^(?=.*[a-zA-ZÀ-ỹà-ỹ])[a-zA-ZÀ-ỹà-ỹ\\s]+$";
        boolean run = true;

        do {
            System.out.println("Hay nhap ten ");
            name = sc.nextLine();
            if (!name.matches(regexName)) {
                System.err.println("Dinh dang ten sai  ");
            } else {
                run = false;
            }
        } while (run);
        return name;
    }

    public  int inputAge(Scanner sc) {
        int age = 0;
        boolean run = true;

        do {
            try {
                System.out.println("Hat nhap tuoi ");
                age = Integer.parseInt(sc.nextLine());
                if (age > 0) {
                    run = false;
                } else {
                    System.err.println("Tuoi khong duoc am");
                }
            } catch (NumberFormatException e) {
                System.err.println("Hay nhap so nguyen hop le ");
            }

        } while (run);


        return age;
    }

    public  Double inputAvg(Scanner sc) {
        double avg = 0.0;
        boolean run = true;

        do {
            try {
                System.out.println("Hay nhap diem trung binh ");
                avg = Double.parseDouble(sc.nextLine());
                if (avg < 0 || avg > 10) {
                    System.err.println("""
                            Nhap diem khong hop le\s
                            0-10
                           \s""");
                } else {
                    run = false;
                }
            } catch (NumberFormatException e) {
                System.err.println("Hay nhap so nguyen hop le ");
            }

        } while (run);


        return avg;
    }



}
