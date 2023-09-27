package org.exercises;

public class Main {
    public static void main(String[] args) {
        //Counter
        /*String input = "uma uma duas tres tres quatro cinco cinco cinco cinco";

        Counter counter = new Counter(input);

        HashMap<String, Integer> totalWords = counter.countWords(input);
        System.out.println("Total de palavras: " + totalWords);*/

        //CheckNOfXO
        /*CheckNOfXO check = new CheckNOfXO();
        System.out.println(check.getXO("hxgoorOXXf"));*/


        //CamelCase
        /*String input = "the-stealth-warrior";
        String camelCase = CamelCase.toCamelCase(input);
        System.out.println(camelCase);*/

        //PrimeNumber
        //System.out.println(PrimeNumber.isPrime(20));

        //noVowels
        //System.out.println(NoVowels.disemvowel("No offense but,\\nYour writing is among the worst I've ever read"));

        //CharRemoval
        //CharRemoval charRemoval = new CharRemoval();
        //System.out.println(charRemoval.removeChar("1macaco gosta de banana2"));

        //FindOdd
        //FindOdd findOdd = new FindOdd();
        //System.out.println(FindOdd.findIt(new int[]{1,2,3,2,1,3,4}));

        //Xbonacci
        /*Xbonacci xbonacci = new Xbonacci();
        double[] s = {1, 1, 1};
        int n = 8;
        double[] result = xbonacci.tribonacci(s, n);
        System.out.println(Arrays.toString(result));*/

        //AreSame
        /*AreSame areSame = new AreSame();
        int[] a = new int[]{121, 144, 19, 161, 11};
        int[] b = new int[]{121, 14641, 361, 25921, 20736};
        System.out.println(AreSame.comp(a, b));*/

        //FindOutlier
        FindOutlier findOutlier = new FindOutlier();
        int[] integers = new int[] {1,3,5,7,8};
        System.out.println(FindOutlier.find(integers));
    }
}
