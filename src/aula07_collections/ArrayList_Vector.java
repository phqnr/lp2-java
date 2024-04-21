package aula07_collections;
import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class ArrayList_Vector {
    public static void main (String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();
        TreeMap<String, Integer> map = new TreeMap<>();
//        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Z", 23);
        map.put("B", 2);
        map.put("K", 11);
        map.put("D", 4);
        map.put("A", 1);
        map.put("E", 5);
        map.put("G", 8);
        map.put("H", 0);
        map.put("F", 6);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // get()
        System.out.println("\n");
        Integer valorA = map.get("A");
        Integer valorC = map.get("C");

        // contains()
        System.out.println("\n");
        System.out.println("Contém o mapa B? " + map.containsKey("B"));

        //containsValue()
        System.out.println("\n");
        System.out.println("Contém o valor? " + map.containsValue(3));

        //remove()
        System.out.println("\n");
        System.out.println("Remova ");

        // Exibindo os valores recuperados
        System.out.println("O valor associado à chave 'A' é: " + valorA);
        System.out.println("O valor associado à chave 'C' é: " + valorC);

//        map.forEach((key, value) -> {
//            System.out.println("Key: " + key + ", Value: " + value);
//        });

    }
}
