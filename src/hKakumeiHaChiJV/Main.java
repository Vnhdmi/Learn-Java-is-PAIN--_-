package hKakumeiHaChiJV;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> res  = new exForReference()::mess; // tham chieu toi doi tuong
        System.out.println(res.get());
    }

}
// reference nhu toi goi tham chieu
