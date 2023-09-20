package org.WordCounter;

public class CharRemoval {
    public String removeChar(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                continue;
            }
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
