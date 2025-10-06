package hMap;

import java.util.HashMap;

import java.util.Map;

public class myMap {
    public static void main(String[] args) {
        Map<String, Integer> memInfo = new HashMap<>() ;
//        memInfo = new LinkedHashMap<>();

        //
        memInfo.put("Linh", 18);
        memInfo.put("Long", 19);
        memInfo.put("Loan", 21);
        memInfo.put("Lam", 16);
        memInfo.put("Lien", 11);
        memInfo.put("Hai", 18);
        memInfo.put("Minh", 18);

        // tim theo key
        System.out.println("Tuoi cua Linh " + memInfo.get("Linh"));
        System.out.println("Nhung nguoi 18 tuoi" );
        memInfo.entrySet().stream().filter(n->n.getValue()==18).forEach(System.out::println);
    }
}
