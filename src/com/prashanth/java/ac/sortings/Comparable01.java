package com.prashanth.java.ac.sortings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Citizen implements Comparable<Citizen> {

    private int age;

    public Citizen(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Citizen cz) {
        return (this.getAge() - cz.getAge());
    }

    @Override
    public String toString() {
        return " Age : "+ this.getAge();
    }
}

class Comparable01 {
    public static void main(String[] args) {
        List<Citizen> people = new ArrayList<>();
        Citizen citizen01 = new Citizen(21);
        Citizen citizen02 = new Citizen(19);
        Citizen citizen03 = new Citizen(45);

        people.add(citizen01);
        people.add(citizen02);
        people.add(citizen03);

        System.out.println("Before Sorting : " + people.toString());
        Collections.sort(people);
        System.out.println("After Sorting : " + people.toString());
    }
}
