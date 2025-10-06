package bt_Clollections_Qlysv;

import java.util.Scanner;

public class checkInput {

    public static String checkName(Scanner sc, String noti) {
        String inputName = "";
        do {
            System.out.println(noti);
            inputName = sc.nextLine();
            if (inputName.isEmpty()) {
                System.err.println("Vui long khong de trong");
            }
        } while (inputName.isEmpty());
        return inputName;
    }

    public static int checkAge(Scanner sc) {
        String inputAge = "";
        do {
            System.out.println("Hay nhap tuoi");
            try {
                inputAge = sc.nextLine();
                if (inputAge.isEmpty()) {
                    System.err.println("Vui long khong de trong");
                } else if (Integer.parseInt(inputAge) < 0) {
                    System.err.println("So tuoi phai la so duong !");
                    inputAge = "";
                    break;
                }
            }catch (Exception e) {
                System.err.println("Tuoi khong hop le ");
            }
        } while (inputAge.isEmpty());
        return Integer.parseInt(inputAge);
    }

    public static Double checkAvg(Scanner sc) {
        String inputAvg = "";
        do {
            System.out.println("Nhap diem trung binh");
            inputAvg = sc.nextLine();
            if (inputAvg.isEmpty()) {
                System.err.println("Vui long khong de trong");
            } else if (Double.parseDouble(inputAvg) < 0.0
                    && Double.parseDouble(inputAvg)  >10.0) {
                System.err.println("Diem trung binh tu 0 10 ");
                inputAvg = "";
            }
        } while (inputAvg.isEmpty());
        return Double.parseDouble(inputAvg);
    }
}

