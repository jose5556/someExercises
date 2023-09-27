package org.exercises;


public class CheckNOfXO {

    public static boolean getXO (String str) {

        char x = 'x';
        char o = 'o';
        int counterX = 0;
        int counterY = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if(c == x) {
                counterX++;
            } else if (c == o) {
                counterY++;
            }
        }
        if (counterX == counterY) {
            return true;
        } else {
            return false;
        }
    }

}
