package org.arihant;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        System.out.println("Enter the string that needs to be reversed :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
        stringBuilderReverse(str);
    }
    private static void reverse(String str){
        String reverseStr = "" ;
        char[] str1 = str.toCharArray();
        for (int i= str1.length -1; i>=0; i--){
             reverseStr += str1[i];
        }
        System.out.println(reverseStr);
    }
    private static void stringBuilderReverse (String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("String Builder :"+sb);
    }

}

