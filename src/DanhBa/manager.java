package DanhBa;

import java.util.Map;
import java.util.Scanner;

public class manager {
    public void addContact (Map<String,Integer> book ) {
        Scanner sc = new Scanner(System.in) ;
        String name = sc.nextLine();
        int phone = Integer.parseInt(sc.nextLine());
        book.put(name,phone);
    }
}
