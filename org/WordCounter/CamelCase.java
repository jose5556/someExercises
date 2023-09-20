package org.WordCounter;

import java.lang.StringBuilder;

public class CamelCase {

    static String toCamelCase(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        String[] words = s.split("-");
        
        if (words == null || words.length == 0) {
            return null;
        }

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                words[i] = words[i].toLowerCase();
            } else {
                String firstLetter = words[i].substring(0, 1).toUpperCase();
                String restOfWord = words[i].substring(1).toLowerCase();
                words[i] = firstLetter + restOfWord;
            }
            stringBuilder.append(words[i]);
        }

        return stringBuilder.toString();
    }
}
