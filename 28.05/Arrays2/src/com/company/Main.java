package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// ArrayList ja Linkedlisti vahe on see, et Arraylisti on parem kasutada elementide sisestamiseks ja väljastamiseks,
        // Linkedlisti on parem kasutada elementide asukoha manipuleerimiseks
        // kui on palju muutmist ja manipuleerimist (järjekordade)
        // Big O notation

        // Sarnasus on: mõlemal on elemendid nagu sisestatud ja samas järjekorras nagu sisestatud

        // Vectori ja Stack <--- iganenud






        // Set ühekordselt andmeid hoidvad

        // HashSet on unikaalselt ilma järjekorrata ja ka suvalises järjekorras väljastab
        // LinkedHashSet on unikaalselt sisestatud järjekorraga
        // Treeset on unikaalselt, aga järjekorras (numbrilised väärtused on kasvavalt või kahanevalt ja
        //          tähed/sõnad on kasvavalt/kahanevalt vastavalt järjekorranumbrile




        // Map-d on VÕTI - VÄÄRTUS
        // HashMap
        // LinkedMap
        // TreeMap (vt ülalt)

        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(4, 10);
        treeMap.put(1,200);
        treeMap.put(10,350);
        treeMap.put(3,5);

        treeMap.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });


        // values
        System.out.println(treeMap.values().toArray()[3]);
        // keyset
        System.out.println(treeMap.keySet().toArray()[3]);

        // key järgi
        System.out.println(treeMap.get(10));

    }
}
