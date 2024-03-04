package homework;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String[] args) {
        //Find duplicate characters in a String
        String word = "karamsarlik";
        Map<String, Integer> myMap = new HashMap<>();
        String[] arr = word.toLowerCase().split("");
        for (String w : arr) {
            Integer num = myMap.get(w);
            if (num == null) {
                myMap.put(w, 1);
            } else {
                myMap.put(w, num + 1);
            } }
            for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
                if(entry.getValue()>1){
                    System.out.print(entry.getKey()+" ");
                }

        }

    }
}
