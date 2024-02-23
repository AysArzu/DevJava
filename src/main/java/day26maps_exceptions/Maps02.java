package day26maps_exceptions;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        //HashMap arka planda nasil calisir?

        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("USA","Washington");
        capitals.put("Turkiye","Ankara");
        capitals.put("Turkiye","Istanbul");//ustune yazar
        capitals.put("Germany","Berlin");
        System.out.println(capitals);

        // java 12 bucket dolunca 16lik bucket daha acar.

    }
}
