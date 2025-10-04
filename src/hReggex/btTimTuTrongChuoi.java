import java.util.Scanner;

public class btTimTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap doan van ban bat ki");
        String str = sc.nextLine();
        System.out.println("Ban da nhap \n" + str);
        System.out.println("Hay nhap tu ban muon tim vi tri ");
        String findIndexStr = sc.nextLine();
        int index = str.indexOf(findIndexStr);
        if (index > 0) {
            System.out.printf("Tu %s xuat nam o vi tri %d trog chuoi " , findIndexStr , index);
        }else {
            System.out.printf("Khong tim thay %s trong chuoi" , findIndexStr);
        }
        sc.close();

    }
}
