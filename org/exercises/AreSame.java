package org.exercises;
import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        int[] aSquare = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            aSquare[i] = a[i] * a[i];
        }

        Arrays.sort(aSquare);
        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {

            if (aSquare[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}




/*
Given two arrays a and b write a function comp(a, b) (orcompSame(a, b))
that checks whether the two arrays have the "same" elements,
with the same multiplicities (the multiplicity of a member is the number of times it appears).
"Same" means, here, that the elements in b are the elements in a squared, regardless of the order.
 */