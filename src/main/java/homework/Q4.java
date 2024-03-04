package homework;

import java.util.HashMap;
import java.util.Map;

public class Q4 {
    //find duplicate words in a String
    public static void main(String[] args) {
        String sentence = "The cat chased the cat, and the second cat chased the first cat";
        String[] arr = sentence.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
        Map<String, Integer> myMap = new HashMap<>();
        for (String w : arr) {
            Integer num = myMap.get(w);
            if (num == null) {
                myMap.put(w, 1);
            } else {
                myMap.put(w, num + 1);
            }

        }

        System.out.println(myMap);
        for (Map.Entry<String,Integer> w:myMap.entrySet()){
        if(w.getValue()>1){

             System.out.print(w.getKey()+ "= "+w.getValue()+" ");
        }
        }

    }


}
