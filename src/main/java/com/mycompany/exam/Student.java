package com.mycompany.exam;

import java.util.ArrayList;

public class Student implements Comparable<Student> {

    private String name;
    private ArrayList<Test> tests = new ArrayList<>();
    private String matricNo;
    private Integer average;

    public ArrayList<Test> getTests() {
        return tests;
    }

    public String getName() {
        return name;
    }

    public Integer getAverage() {
        return average;
    }

    public Student(String name, String matricNo) {
        this.name = name;
        this.matricNo = matricNo;
    }

    public void addTestScore(Test test) {
        tests.add(test);
    }

    public void printStudentTestAverage() {
        average = 0;
        for (Test test : tests) {
            average += test.getScore();
        }
        average = average / 2;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAverage().compareTo(o.getAverage());
    }
}
