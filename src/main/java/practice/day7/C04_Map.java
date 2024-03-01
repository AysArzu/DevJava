package practice.day7;

import java.util.*;

public class C04_Map {

    /*
        İki farklı Arrayde aynı indekste barındırılan ad ve soyadları örnekteki gibi
        yazdıran bir kod yazınız.
        input: {"John","Mark","Ali"}, {"Steinbeck","Down","Can"};
        output: {John=Steinbeck, Mark=down,Ali=Can}
 */
    public static void main(String[] args) {
        String []isimler= {"John","Mark","Ali"};
        String[]soyIsimler={"Steinbeck","Down","Can"};
        Map<String,String> myMap= new HashMap<>();
        for (int i = 0; i <isimler.length ; i++) {
            myMap.put(isimler[i],soyIsimler[i]);

        }
        System.out.println(myMap);

        System.out.println("****************************************************************");




    }
}
