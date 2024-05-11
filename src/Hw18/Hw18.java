package Hw18;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hw18 {

    public static void main(String[] args) {

        //1
        String str1 = "Hello";
        String str2 = "Lovare";
        System.out.println(reverse(str1));
        System.out.println(reverse(str2));
        System.out.println("==============");

        //2
        String str3 = "Aloha";
        String str4 = "Malaysia";
        System.out.println(vowelsCounter(str3) + " wovels in word: " + str3);
        System.out.println(vowelsCounter(str4) + " wovels in word: " + str4);
        System.out.println("==============");

        //3
        String str5 = "Car";
        String str6 = "Rotator";
        String sentence1 = "Mr. Owl ate my metal worm";
        System.out.println(palindrom(str5));
        System.out.println(palindrom(str6));
        System.out.println(palindrom(sentence1));
        System.out.println("==============");

        //4
        String str7 = "JjjKkkKllLL";
        String str8 = "dfghgfdsafgdsa";
        System.out.println(removeRepeatingLetters(str7));
        System.out.println(removeRepeatingLetters(str8));
        System.out.println("==============");

        //5
        String str9 = "Hello world";
        String str10 = "The cat was seen on flowering avenue.";
        System.out.println(Arrays.toString(separateByWhitespace(str9)));
        System.out.println(Arrays.toString(separateByWhitespace(str10)));
    }

    public static String reverse(String str){

        StringBuilder strB = new StringBuilder(str.toLowerCase());
        return strB.reverse().toString();
    }

    public static int vowelsCounter(String str) {

        char[] wovels = new char[]{'a', 'e', 'i', 'o', 'u'};
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char temp = str.toLowerCase().charAt(i);
            for (char wovel : wovels) {if (temp == wovel) {count++;}}
        }
        return count;
    }

    public static String palindrom(String str){

        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder strB = new StringBuilder(str);

        if (str.contentEquals(strB.reverse())) {
            return "Palindrom";
        } else {return "Not Palindrom";}
    }

    public static String removeRepeatingLetters(String str){

        str = str.toLowerCase();
        StringBuilder strCopy = new StringBuilder();
        Set<Character> strSet = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            strSet.add(str.charAt(i));}
        for (Character c : strSet) {
            strCopy.append(c);}
        return strCopy.toString();
    }

    public static String[] separateByWhitespace(String str){
        String separator = " ";
        return str.split(separator);
    }

}

