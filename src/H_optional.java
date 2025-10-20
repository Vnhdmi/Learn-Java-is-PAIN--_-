import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class H_optional {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("dog","cat", "dragon","bird", "fish" );

        //let's see

        list.stream().filter(n -> n.equals("king"))
                .forEach(System.out::println);
        System.out.println("used optional ");
        Optional<String> opt = list.stream().filter(n -> n.equals("king")).sorted().findFirst();
        opt.ifPresent(System.out::println);
        System.out.printf(String.format(opt.orElse("Khong tim thay"))) ;
    }
}
