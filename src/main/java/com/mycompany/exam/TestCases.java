package com.mycompany.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestCases {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstScore = 0;
        int secondScore = 0;
        List<Student> students = new ArrayList<>();
        for (int i = 0; i <= 70; i++) {
            System.out.println("Enter name of student");
            String name = input.nextLine();
            System.out.println("Enter name of matric no");

            String matric = input.nextLine();
            System.out.println("Enter name of first test name");
            String firstTest = input.nextLine();
            try {
                System.out.println("Enter name of first test score");
                firstScore = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
            System.out.println("Enter name of second test name");
            String secondTest = input.nextLine();
            try {
                System.out.println("Enter name of second test score");
                secondScore = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
            }
            Student student = new Student(name, matric);
            student.addTestScore(new Test(firstTest, firstScore));
            student.addTestScore(new Test(secondTest, secondScore));
            student.printStudentTestAverage();
            students.add(student);
        }
//        Student student1 = new Student("Bob", "224193");
//        student1.addTestScore(new Test("CSC 745", 80));
//        student1.addTestScore(new Test("CSC 746", 60));
//        Student student2 = new Student("Bobi", "22493");
//        student2.addTestScore(new Test("CSC 745", 40));
//        student2.addTestScore(new Test("CSC 746", 20));
//        Student student3 = new Student("Bayo", "22493");
//        student3.addTestScore(new Test("CSC 745", 20));
//        student3.addTestScore(new Test("CSC 746", 20));
//        Student student4 = new Student("Bosun", "22493");
//        student4.addTestScore(new Test("CSC 745", 50));
//        student4.addTestScore(new Test("CSC 746", 20));
//        student1.printStudentTestAverage();
//        student2.printStudentTestAverage();
//        student3.printStudentTestAverage();
//        student4.printStudentTestAverage();
//        students.add(student4);
//        students.add(student3);
//        students.add(student2);
//        students.add(student1);
        Collections.sort(students);
        Collections.reverse(students);
        for (int i = 0; i < 3; i++) {
            int position = i + 1;
            System.out.println("Position " + position + " is " + students.get(i).getName() + " with average of " + students.get(i).getAverage() + ". The scores are" + students.get(i).getTests().toString());
        }
    }
}
