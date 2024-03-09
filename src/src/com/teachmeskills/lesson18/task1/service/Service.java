package src.com.teachmeskills.lesson18.task1.service;

import java.util.*;
import java.util.stream.Stream;

public class Service {
    public static List<Integer> inputArray(){
        List<Integer> list = new ArrayList<>();
        Random ran = new Random();
        while (list.size() < 30){
            list.add(ran.nextInt(1,50));
        }
        return list;
    }

    public static void removingDuplicates(List<Integer> list){
        System.out.println("Removing of Duplicates --------------------------------------");
        System.out.println(list);
        Stream<Integer> stream = list.stream()
                .distinct();
        stream.forEach((e) -> System.out.print(e + ", "));
        System.out.println();

    }

    public static void outputElements(List<Integer> list){
        System.out.println("All even elements in the range from 7 to 17 -----------------");
        System.out.println(list);
        Stream<Integer> stream = list.stream()
                .skip(6)
                .limit(11)
                .filter(s -> s % 2 == 0);
        stream.forEach((e) -> System.out.print(e + " "));
        System.out.println();
    }
    public static void multiplicationElements(List<Integer> list){
        System.out.println("Each element multiplied by 2 --------------------------------");
        System.out.println(list);
        Stream<Integer> stream = list.stream()
                .map(s -> s * 2);
        stream.forEach((e) -> System.out.print(e + " "));
        System.out.println();
    }
    public static void sortingElements(List<Integer> list){
        System.out.println("Sort and display the first 4 elements -----------------------");
        System.out.println(list);
        Stream<Integer> stream = list.stream()
                .sorted()
                .limit(4);
        stream.forEach((e) -> System.out.print(e + " "));
        System.out.println();
    }
    public static void amountElements(List<Integer> list){
        System.out.println("Number of elements in stream -------------------------------");
        System.out.println(list.stream()
                .count());
        System.out.println();
    }
    public static void average(List<Integer> list){
        System.out.println("Arithmetic average of all numbers in the stream ------------");
        double average = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();
        System.out.println(average);
    }
}
