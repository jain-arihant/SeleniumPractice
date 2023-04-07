package org.arihant;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String firstString = sc.nextLine();
        System.out.println(firstString);
        System.out.println("Enter the second string: ");
        String secondString = sc.nextLine();
        anagramCheck(firstString,secondString);
    }
    public static void anagramCheck(String str1, String str2){
        boolean result = true;
        int length1 = str1.length();
        int length2 = str2.length();
        if (length1!=length2){
            result = false;
        }
        else {
            char str11[]= str1.toLowerCase().toCharArray();
            char str22[]= str2.toLowerCase().toCharArray();
            Arrays.sort(str11);
            Arrays.sort(str22);
            result = Arrays.equals(str11,str22);
        }
        if(result){
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }

    }
}
