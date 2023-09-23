package org.WordCounter;
import java.util.HashMap;

public class Counter {
    private String word;
    private HashMap<String, Integer> mapa = new HashMap<>();

    public Counter(String word) {
        this.word = word;
    }

    public HashMap<String, Integer> countWords(String words) {

        if (word == null || word.isEmpty()) {
            return null;
        }

        for(String word : words.split(" ")) {

            //mapa.put(word, mapa.containsKey(word) ? mapa.get(word) + 1 : 1);
            if (mapa.containsKey(word)) {
                int count = mapa.get(word);
                mapa.put(word, count + 1);
            } else {
                mapa.put(word, 1);
            }
        }
        return mapa;
    }
}
