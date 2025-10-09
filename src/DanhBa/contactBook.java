package DanhBa;

import java.util.HashMap;
import java.util.Map;

public class contactBook {
    private String name ;
    private int phone ;
    Map<String,Integer> contact = new HashMap<>() ;
    @Override
    public String toString() {
        return "contactBook{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", contact=" + contact +
                '}';
    }
}
