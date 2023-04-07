package org.arihant;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 20};
        System.out.println("Enter the number whose sum needs to be searched for: ");
        int target = sc.nextInt();
        twoSumCheck(input, target);
    }
    private static int[] twoSumCheck(int[] num, int sum){
        Map<Integer,Integer> map = new HashMap<>();
        if(num.length!=0){
            for(int i=0; i<num.length;i++){
            int complement = sum - num[i];
            if (map.containsKey(complement)) {
                int index1 = map.get(complement)+1;
                int index2 = i+1;
                System.out.println("values: "+index1+","+ index2 );
            }
                map.put(num[i],i);

        }}
        else {
            System.out.println("The list is empty!!");
        }
        return null;
    }

}
