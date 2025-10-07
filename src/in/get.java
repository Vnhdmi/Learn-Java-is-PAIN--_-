package in;

import java.util.Scanner;

public class get {
    public static String inputName (Scanner sc) {
        String name ="";
        String regexName = "^(?=.*[a-zA-ZÀ-ỹà-ỹ])[a-zA-ZÀ-ỹà-ỹ\\s]+$";
        boolean run= true;

        do {
            System.out.println("Hay nhap ten ");
            name = sc.nextLine();
            if (!name.matches(regexName)) {
                System.out.println("Dinh dang ten sai  ");
            }else {
                run= false;
            }
        }while (run);
        return name ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputName(sc);
    }
}
