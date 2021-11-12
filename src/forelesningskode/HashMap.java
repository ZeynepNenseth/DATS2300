package forelesningskode;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap {
    public static void main(String[] args) {
        int hash_map_size = 7;
        ArrayList<LinkedList<String>> hash_map = new ArrayList<>(hash_map_size);

        for (int i=0; i<hash_map_size; ++i) {
            hash_map.add(i, new LinkedList<>());
        }

        //Lager test-strenger
        String[] strings = new String[5];
        strings[0] = "Hei";
        strings[1] = "På deg din gamle sjokolade";
        strings[2] = "Peder";
        strings[3] = "Test";
        strings[4] = "Hallo";

        //Legg inn test-strenger i hashmap'et
        for (int i=0; i<strings.length; ++i) {
            int hash = hash(strings[i]);          // hash er et stort heltall
            int hash_map_index = computeHashmapIndex(hash, hash_map_size);
            System.out.println("Legger inn '" + strings[i] + "' med hash " + hash + " på plass " + hash_map_index);
            hash_map.get(hash_map_index).addFirst(strings[i]);
        }

        //Søk etter en streng
        String item = "Test";
        int hash = hash(item);
        int hash_map_index = computeHashmapIndex(hash, hash_map_size);
        System.out.println("Strengen " + item + " finnes i hashmap'et: " + hash_map.get(hash_map_index).contains(item));
    }

    static int computeHashmapIndex(int hash, int hash_map_size) {
        return hash % hash_map_size;
    }

    static int hash(String data) {
        int hash = 0;

        //Sum av alle bokstavene (ikke optimalt).
        //for (int i=0; i<data.length(); ++i) {
        //    hash = hash + (int) data.charAt(i);
        //}

        for (int i=data.length()-1; i>= 0; --i) {
            char c = data.charAt(i);
            hash = (hash + c)*31;
        }

        if (hash < 0) {
            hash = -hash;
        }

        return hash;
    }
}
 /*
Legger inn Hei med hash 3227348 på plass 5
Legger inn På deg din gamle sjokolade med hash 1176180418 på plass 0
Legger inn Peder med hash 934889820 på plass 4
Legger inn Test med hash 110654066 på plass 5
Legger inn Hallo med hash 1014078390 på plass 3
Strengen Test finnes i hashmap'et: true

  */