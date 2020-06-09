package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("src/com/company/processed_data.txt");
//
//        Files.readAllLines(Paths.get("src/com/company/data.txt")).stream()
//                .map(element -> element.split(" "))
//                .filter(element -> Integer.parseInt(element[0])>5)
//                .map(e -> e[0] + " " + e[1])
//                .forEach(printWriter::println);

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> integerList2 = integerList.stream()
                .filter(e -> e < 5 && e >= 2)
                .collect(Collectors.toList());

        for (Integer i :integerList2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println();

        List<Integer> integerList3 = integerList.stream()
                .map(e -> e * 2)
                .skip(3)
                .limit(2)
                .peek(printWriter::println)
                .map(e -> e * 2)
                .collect(Collectors.toList());

        for (Integer i : integerList3) {
            System.out.println(i);
        }
        printWriter.close();

    }

}
