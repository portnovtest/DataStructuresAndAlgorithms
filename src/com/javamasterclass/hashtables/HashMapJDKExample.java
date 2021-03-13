package com.javamasterclass.hashtables;

import java.util.HashMap;
import java.util.Map;

public class HashMapJDKExample {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        Map<String, Employee> hashMap = new HashMap<>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Wilson", mikeWilson);
        hashMap.put("Smith", marySmith);

        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(janeJones));

        hashMap.putIfAbsent("Doe", mikeWilson);

        System.out.println(hashMap.get("Smith"));
        System.out.println(hashMap.getOrDefault("someone", mikeWilson));

//        Iterator<Employee> iterator = hashMap.values().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));
    }
}
