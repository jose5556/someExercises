package org.WordCounter;

public class FindOutlier {
    static int find(int[] integers) {

        boolean isOdd = false;
        boolean isEven = false;
        int countOdd = 0;
        int countEven = 0;

        if (integers == null || integers.length <= 2) {
            return 0;
        }

        for (int i = 0; i < 3; i++) {

            if (integers[i] % 2 == 0) {
                countEven++;
                System.out.println(integers[i] + " is even, and i have already found " + countEven + " even numbers");

            } else if (integers[i] % 2 != 0) {
                countOdd++;
                System.out.println(integers[i] + " is odd, and i have already found " + countOdd + " odd numbers");
            }

            if (countOdd < countEven) {
               isOdd = true;
            } else if (countEven < countOdd) {
                isEven = true;
            }
        }

        for (int i = 0; i < integers.length; i++) {
            if (isOdd == true && integers[i] % 2 != 0) {
               return integers[i];
            } else if (isEven == true && integers[i] % 2 == 0) {
                return integers[i];
            }
        }
        return 0;
    }
}




/*
You are given an array (which will have a length of at least 3,
but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers
except for a single integer N.
Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
 */