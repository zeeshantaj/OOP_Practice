package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class School {

    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student1> student1s = new ArrayList<>();
    ArrayList<Classes> classesList = new ArrayList<>();

    public void addStudent(Student1 student1){
        student1s.add(student1);
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void addClasses(Classes classes){
        classesList.add(classes);
    }
    public void removeStudent(Student1 student1){
        student1s.remove(student1);
    }
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }
    public void removeClasses(Classes classes){
        classesList.remove(classes);
    }


    public static void main(String[] args) {
        Classes classes = new Classes(21);
        Classes classes1 = new Classes(22);
        Classes classes2 = new Classes(23);

        Student1 student1 = new Student1("zee",1232,12);
        Student1 student2 = new Student1("zee1",12321,123);
        Student1 student3 = new Student1("zee2",12322,124);

        Teacher teacher = new Teacher("rizwan", "Math");
        Teacher teacher1 = new Teacher("abdullah", "statistics");
        Teacher teacher2 = new Teacher("irfan", "OOP");
        School school = new School();
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addClasses(classes);
        school.addClasses(classes2);
        school.addClasses(classes1);
        school.addTeacher(teacher);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        System.out.println("studentInfo"+student1.getName()+ " "+student1.getRoll()+" "+student1.getId());
        System.out.println("studentInfo"+student2.getName()+ " "+student2.getRoll()+" "+student2.getId());
        System.out.println("studentInfo"+student3.getName()+ " "+student3.getRoll()+" "+student3.getId());

        System.out.println("TeacherInfo"+teacher.getName()+ " "+teacher.getCourseName());
        System.out.println("TeacherInfo"+teacher1.getName()+ " "+teacher1.getCourseName());
        System.out.println("TeacherInfo"+teacher2.getName()+ " "+teacher2.getCourseName());

        System.out.println("ClassesInfo"+classes.getClassNumber());
        System.out.println("ClassesInfo"+classes1.getClassNumber());
        System.out.println("ClassesInfo"+classes2.getClassNumber());

        System.out.println("after removing teacher1");
        school.removeTeacher(teacher1);
    }

}
class Classes{
    int classNumber;

    public Classes(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }
}
class Teacher{
    private String name,courseName;

    public Teacher(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
class Student1{
    String name;
    int roll;
    int id;

    public Student1(String name, int roll, int id) {
        this.name = name;
        this.roll = roll;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
