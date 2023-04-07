package org.arihant;

import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Print the size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers of the array : ");
        for (int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Enter the number whose sum needs to be searched for: ");
        int target = sc.nextInt();
        twoSumCheck(list, target);
    }
    private static void twoSumCheck(ArrayList list, int sum){
        Map<Integer,Integer> map = new HashMap<>();


        if(list.size()!=0){
            for(int i=0; i<list.size();i++){
            int complement = sum - list.get(i);
            if (map.containsKey(complement)){
                return new int[]{map.get(complement,i)};
            }
            else {
                map.put(list[i],complement);
            }
        }}
        else {
            System.out.println("The list is empty!!");
        }
    }

}
