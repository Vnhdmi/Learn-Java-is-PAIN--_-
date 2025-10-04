import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class udRegex {
    public static void main(String[] args) {
        // Kiem tra tinh hop le cua Email
        Scanner sc = new Scanner(System.in);
        System.out.println("--Tao tai khoa hoc JAVa ^_^");
        System.out.println("Hay nhap dia chi email bat ky");
        String inputEmai = sc.nextLine();
        Pattern patternEmail = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");// Bieu thuc cua tai khoan
        Pattern patternPassword = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$!%]).{8,}$"
        ); // Bieu thuc cua mat khau
        Matcher matcherEmail = patternEmail.matcher(inputEmai);
        boolean matchFound = matcherEmail.matches();

        if (matchFound) {
            System.out.println("Day la email hop le");
            System.out.println("Hay tao mat khau ");
        }else{
            System.out.println("Day la email khong hop le");
        }
        String inputPassword = sc.nextLine();
        Matcher matcherPassword = patternPassword.matcher(inputPassword);
        boolean  matchPassword = matcherPassword.matches();
        if (matchPassword) {
            System.out.println("Day la password hop le");
        }else System.out.println("Day la password khong hop le");
    }
}
