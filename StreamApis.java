package study.java8;

import java.util.*;
import java.util.stream.*;

public class StreamApis {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        list.forEach(System.out::println);
        list.forEach(MethodReferenc::print);

        Long out = list.stream().count();
        System.out.println(out);

        Optional<Boolean> predicate= Optional.of(list.stream().allMatch(i -> i < 10));
        System.out.println(predicate);

        boolean predicate2= list.stream().allMatch(i -> i <  11);
        System.out.println(predicate2);

        System.out.println(list.stream().anyMatch(i -> i < 10));

        Integer out4 = list.stream().collect(Collectors.toList()).stream().findAny().get();
        System.out.println("Find out : " + out4);
        Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(i -> i , i -> i*i));

        List<Integer> list1 = list.stream()
                .filter(i -> i<8)
                .map(i->i*i)
                .collect(Collectors.toList());

        list1.forEach(i -> System.out.println("square is : " + i));

        list1.stream().collect(Collectors.toUnmodifiableList());

        map.entrySet().stream().toList();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println("key is : " + entry.getKey());
            System.out.println("Value is : " + entry.getValue());
        }

        for(Integer i: map.keySet()) {
            System.out.println(i);
        }
        System.out.println(map.values());

        System.out.println("finf first :  "+ Optional.of(list1.stream().findAny()));
        System.out.println("distinct  :  "+ list1.stream().distinct().findFirst());
        System.out.println("None Match  :  "+ list1.stream().noneMatch(i -> i==16));
        DoubleStream l1 =list1.stream().mapToDouble(i -> i);

        IntStream l2 = list1.stream().flatMapToInt(i -> IntStream.of(i)).parallel();

        l1.forEach( System.out::println);
        DoubleStream l3 =list1.stream().mapToDouble(i -> i);
        System.out.println("max is : " + l3.max());
        l2.forEach(System.out::println);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()  );

        int[][] maxPro = new int[1][2];
        Arrays.sort(maxPro, (a,b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> maxCapitalProfit = new PriorityQueue<>(Comparator.reverseOrder());

    }


}
