//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class btLocTenMien {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Cong cu check URL");
//        System.out.println("Hay nhap URL bat ki ");
//        String inputURL = sc.nextLine();
//        String regexURL = ("(https?)://([^/]+)(/.*)?");
//        String protocol;
//        String domain  ;
//        String path ;
//
//        if(regexURL.matches(inputURL)) {
//            System.out.println("Day la URL hop le ");
//            System.out.println("Tien hanh phan tich . . . . ");
//                protocol = group(1);
//                domain = matchURL.group(2);
//                path = matchURL.group(3); if (path == null) path = "Duong dan trong";
//                System.out.printf("Giao thuc: %s, Ten mien: %s, Duong dan: %s ", protocol, domain,path);
//
//        }else {
//            System.out.println("URL nay khong hop le");
//        }
//    }
//}
