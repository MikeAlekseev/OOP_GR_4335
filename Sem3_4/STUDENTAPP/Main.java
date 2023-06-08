package Sem3_4.STUDENTAPP;

import java.util.Collections;

/*
 * В методе main создается объект stream класса StudentStream с номером потока 1. 
 * Затем создаются три объекта group1, group2, group3 класса StudentGroup
 * с разным количеством студентов,
 * каждая группа добавляется всписок групп потока.
 */
 
 public class Main {
    public static void main(String[] args) {
        StudentStream stream = new StudentStream(1);

        StudentGroup group1 = new StudentGroup("Group 1", 20);
        StudentGroup group2 = new StudentGroup("Group 2", 55);
        StudentGroup group3 = new StudentGroup("Group 3", 30);
        StudentGroup group4 = new StudentGroup("Group 4", 45);
        StudentGroup group5 = new StudentGroup("Group 5", 60);

        stream.addGroup(group1);
        stream.addGroup(group2);
        stream.addGroup(group3);
        stream.addGroup(group4);
        stream.addGroup(group5);
/*
 * Цикл for используется для вывода списка групп на консоль, 
 * а после этого список сортируется методом sort класса Collections, 
 * используя интерфейс Comparable.
 */
 
        for (StudentGroup group : stream) {
            System.out.println(group);
        }

        Collections.sort(stream.getGroups());
        for (StudentGroup group : stream) {
            System.out.println(group);
        }
    }
/*
 * После сортировки группы выводятся на консоль в отсортированном порядке.
 */
} 
