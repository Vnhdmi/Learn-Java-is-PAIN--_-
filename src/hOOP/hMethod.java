import java.util.Scanner;

 class tryMakeMethod {
    //Phuong thuc co tra ve
    public int height ( int height){
        return height ;
    }
    //Phuong thuc khong co tra ve
    public void cauKinhDien (int height){
        System.out.printf("Vay chieu cao cua ban la %d" ,height);
    }

}
public class hMethod {
    public static void main(String[] args) {
        tryMakeMethod htry = new tryMakeMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao cua ban");
        int inputHeight = Integer.parseInt(sc.nextLine());
        htry.cauKinhDien(inputHeight);

    }

}
