package homework;
import java.util.HashMap;
import java.util.Map;


public class Q1 {
    public static void main(String[] args) {

        //Find the first nin-repeated character in a String

        String word = "Associate Press";
        word = word.replaceAll("[^A-Za-z]", "").toLowerCase();
        String[] letters = word.split("");
        Map<String, Integer> myMap = new HashMap<>();
        for (String w : letters) {
            Integer num = myMap.get(w);
            if (num == null) {
                myMap.put(w, 1);
            } else {
                myMap.put(w, num + 1);
            }
        }
        System.out.println(myMap);//{p=1, a=2, r=1, s=4, c=1, t=1, e=2, i=1, o=1}

        System.out.println(myMap.keySet());//[p, a, r, s, c, t, e, i, o]
        for (Map.Entry<String , Integer> entry: myMap.entrySet()) {
            if(entry.getValue().equals(1)){
                System.out.println(entry.getKey());
                break;
            }
        }




    }

}
