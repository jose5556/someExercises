package org.exercises;

public class NoVowels {
    public static String disemvowel(String str) {
        String word = "";
         for (int i = 0; i < str.length(); i++) {
             char character = Character.toLowerCase(str.charAt(i));
             if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                 i++;
             }
             word += str.charAt(i);
         }
         return word;
    }
}


/* a frase "No offense but,\nYour writing is among the worst I've ever read"
resistes and prints vowels, explore more stringBuilder
 */