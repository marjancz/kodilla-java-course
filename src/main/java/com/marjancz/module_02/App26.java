package com.marjancz.module_02;
import java.util.*;
import java.lang.*;
import java.io.*;

class Student{
    private String firstName;
    private String lastName;
    private String classNo;

    public Student(String firstName, String lastName, String classNo){
        this.firstName = firstName;
        this.lastName = lastName;
        this.classNo = classNo;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getClassNo() {
        return this.classNo;
    }

    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public boolean equals(Object o){
        final Student e = (Student) o;
        return (this.firstName == e.firstName) && (this.lastName == e.lastName) &&
                (this.classNo == e.classNo);
    }

    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, classNo);
        //Integer.parseInt(classNo.substring(0, 1));
    }

    public String toString() {
        return (lastName + " " + firstName + " " + "(" + classNo + ")");
    }
}

class Subject {
    private List<Double> grades;
    private String name;
    public Subject(String name, List<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    public double averageSubject() {
        double sum = 0;
        for(int i=0; i< grades.size(); i++) {
            sum += grades.get(i);
        }

        return sum / grades.size();
    }
}

class Grades {
    private List<Subject> subjectList;

    public Grades(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public List<Subject> getSubjectList() {
        return this.subjectList;
    }
}

class App26 {

    public static void main (String[] args) throws java.lang.Exception {

        Student student1 = new Student("Marta", "Nowak", "4b");
        Student student2 = new Student("Marta", "Nowak", "1b");
        Student student3 = new Student("Mariusz", "Janczyk", "2a");
        Student student4 = new Student("Andrzej", "Kowalski", "1a");

        Subject polish1 = new Subject("polish", Arrays.asList(5.0, 3.0, 3.0, 2.0, 5.0));
        Subject maths1 = new Subject("maths", Arrays.asList(4.0, 4.0, 5.0, 2.5));
        Subject physics1 = new Subject("physics", Arrays.asList(5.0, 6.0, 5.0, 6.0, 4.0));
        Subject chemistry1 = new Subject("Chemistry", Arrays.asList(6.0, 4.0, 3.0, 3.0, 2.0));
        Subject polish2 = new Subject("polish", Arrays.asList(5.0, 4.5, 3.0, 3.0, 2.5));
        Subject maths2 = new Subject("maths", Arrays.asList(4.0, 4.0, 5.0, 2.5, 3.5));
        Subject physics2 = new Subject("physics", Arrays.asList(5.0, 6.0, 5.0, 6.0, 4.0));
        Subject chemistry2 = new Subject("Chemistry", Arrays.asList(6.0, 4.0, 3.0, 3.0, 2.0));
        Subject polish3 = new Subject("polish", Arrays.asList(5.0, 4.5, 3.0, 3.0, 2.5));
        Subject maths3 = new Subject("maths", Arrays.asList(4.0, 4.0, 5.0, 2.5, 3.5));
        Subject physics3 = new Subject("physics", Arrays.asList(5.0, 6.0, 5.0, 6.0, 4.0));
        Subject chemistry3 = new Subject("Chemistry", Arrays.asList(6.0, 4.0, 3.0, 3.0));
        Subject polish4 = new Subject("polish", Arrays.asList(5.5, 4.5, 3.0, 3.0, 2.5));
        Subject maths4 = new Subject("maths", Arrays.asList(4.0, 4.0, 5.0, 2.5, 3.5));
        Subject physics4 = new Subject("physics", Arrays.asList(5.0, 6.0, 5.0, 6.0, 4.0));
        Subject chemistry4 = new Subject("Chemistry", Arrays.asList(6.0, 4.0, 3.0, 2.0, 3.0));

        Grades grades1 = new Grades(Arrays.asList(polish1, maths1));
        Grades grades2 = new Grades(Arrays.asList(polish2, maths2, physics2, chemistry2));
        Grades grades3 = new Grades(Arrays.asList(polish3, maths3, physics3, chemistry3));
        Grades grades4 = new Grades(Arrays.asList(polish4, maths4, physics4, chemistry4));

        HashMap<Student, Grades> gradesOfStudent = new HashMap<Student, Grades>();

        gradesOfStudent.put(student1, grades1);
        gradesOfStudent.put(student2, grades2);
        gradesOfStudent.put(student3, grades3);
        gradesOfStudent.put(student4, grades4);

        for(Map.Entry<Student, Grades> entry : gradesOfStudent.entrySet()) {
            double sum = 0;
            double average = 0;
            for(int i=0; i<entry.getValue().getSubjectList().size(); i++) {
                sum += entry.getValue().getSubjectList().get(i).averageSubject();
            }
            average = sum / (entry.getValue().getSubjectList().size());
            System.out.println("Average grades of: " + entry.getKey() + " is: " + average);
        }
    }
}
