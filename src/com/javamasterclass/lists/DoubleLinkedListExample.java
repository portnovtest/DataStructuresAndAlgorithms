package com.javamasterclass.lists;

import java.util.List;

public class DoubleLinkedListExample {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());
        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

        Employee jamesBond = new Employee("James","Bond",007);
        list.addBefore(jamesBond,johnDoe);
        list.printList();
        System.out.println(list.getSize());
        Employee firstGuy = new Employee("First","Guy",111);
        list.addBefore(firstGuy, marySmith);
        list.printList();
        System.out.println(list.getSize());
    }
}
