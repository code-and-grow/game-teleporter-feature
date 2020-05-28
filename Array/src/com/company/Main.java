package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List<String> arrayList = new ArrayList<>(Arrays.asList("teine", "kolmas"));
	    List<Integer> linked = new LinkedList<>();

	    arrayList.add("esimene");
	    arrayList.add("teine");

        for (Object o : arrayList) {
            System.out.println(o);
        }

        linked.add(1);
        linked.add(2);
        linked.add(2);

        for (Object number:linked) {
            System.out.println(number);
        }

        Set<Boolean> hashSet = new HashSet<>();
        hashSet.add(true);
        hashSet.add(false);
        hashSet.add(false);
        hashSet.add(true);

        for (Object booleanValue:hashSet) {
            System.out.println(booleanValue);
        }

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("yks", 1);
        hashMap.put("kaks", 2);
        hashMap.put("kolm", 3);

        hashMap.entrySet().forEach(sdasdsa->{
            System.out.println(sdasdsa.getKey() + " " + sdasdsa.getValue());
        });

        System.out.println(hashMap);
    }
}
