package com.javaLearning;

import io.cucumber.java.be.I;

import java.util.*;

public class Collections {
    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("selenium");
        list.add(("java"));
        for (String item : list){
            System.out.println(item);
        }
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("selenium");
        set.add("java");
        for (String item : set){
            System.out.println(item);
        }
        Queue<Integer> queue =  new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue:" + queue);

        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Vasanth");
        map.put(101, "vamsi");
        map.put(103,"manideep");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
