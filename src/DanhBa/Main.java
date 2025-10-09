package DanhBa;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
     contactBook stb = new contactBook();
     new manager().addContact((Map<String, Integer>) stb);

    }
}
