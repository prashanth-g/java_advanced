package com.prashanth.java.ac.sortings;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Citizen01 {

    private int age;

    public Citizen01(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return " Age : "+ this.getAge();
    }
}

class AgeComparator implements Comparator<Citizen01> {

    @Override
    public int compare(Citizen01 c1, Citizen01 c2) {
        return (c1.getAge() - c2.getAge());
    }
}

public class Comparator01 {
    public static void main(String[] args) {
        List<Citizen01> people = new ArrayList<>();
        Citizen01 citizen01 = new Citizen01(21);
        Citizen01 citizen02 = new Citizen01(19);
        Citizen01 citizen03 = new Citizen01(45);

        people.add(citizen01);
        people.add(citizen02);
        people.add(citizen03);

        System.out.println("Before Sorting : " + people.toString());
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(people, ageComparator);
        System.out.println("After Sorting : " + people.toString());
    }
}
