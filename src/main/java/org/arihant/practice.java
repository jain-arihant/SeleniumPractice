package org.arihant;

import io.cucumber.java.sl.In;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        //HashSet
        Set<Integer> hashset = new HashSet<>();
        System.out.println(hashset.isEmpty());
        hashset.add(5);
        System.out.println(hashset.size());
        System.out.println(hashset.contains(2));
        //HashMap
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("a"));
        map.putIfAbsent(2,"b");
        map.putIfAbsent(3,"c");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);

        //ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        list.clear();
        list.add(2);
        list.add(5);
        list.add(7);
        System.out.println(list);
        System.out.println(list.contains(5));

    }

}
