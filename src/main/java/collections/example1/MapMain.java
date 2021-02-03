package collections.example1;

/*
MAP - key value pairs, no duplicate keys
 */

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> zodynas = new HashMap<>();
        zodynas.put("Stalas", "Daiktas ant kurio dedame daiktus");
        zodynas.put("Kede", "daiktas nat kurio sedime");
        zodynas.put("Suo", "Gyvas daiktas, kuris loja");

        //istraukiam visus irasus - EntrySet
        for (Map.Entry<String, String> irasas : zodynas.entrySet()) {
            System.out.println(irasas.getKey() + "-" + irasas.getValue());
        }

        //istraukiam visus raktus - KeySet

        for (String raktas : zodynas.keySet()) {
            System.out.println(raktas);
        }

        //istraukiam visus reiksmes - values

        for (String rieksme : zodynas.values()) {
            System.out.println(rieksme);
        }

        System.out.println(zodynas.get("Suo"));
        zodynas.remove("Kede");
        System.out.println(zodynas);

    }
}
