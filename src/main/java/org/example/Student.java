package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name, grade;
    public  ArrayList<String> courses;

    public Student(String name,String grade){
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }

    public ArrayList < String > getCourses() {

        return courses;
    }

    public  void addCourse(String course){
        courses.add(course);
    }
    public  void removeCourse(String course){
        courses.remove(course);
    }

    public static void main(String[] args) {
        Student student = new Student("zohaib", "grade b");
        Student student1 = new Student("zee", "grade c");

        student1.addCourse("calculus");
        student.addCourse("Artificial intelligence");
        System.out.println("Student details add " + student1.getName()+" "+student1.getGrade());
        System.out.println("Student details add " + student.getName()+" "+student.getGrade());

        student1.removeCourse("calculus");
        System.out.println("after remove"+student1.getCourses());
        System.out.println("after remove"+student.getCourses());
    }
}
