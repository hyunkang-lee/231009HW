package com.greedy.level02.normal.student.model.vo;

import java.util.Scanner;

public class StudentVO {
    private int grade ;
    private int classroom ;
    private String name;
    private double height;
    private char gender;
    public StudentVO() {

    }

    public StudentVO(int grade, int classroom, String name, double height, char gender){
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public void printInformation(){

        System.out.println("\ngrade : " + this.grade + "\nclassroom : " + this.classroom + "\nname : " + this.name +
                "\nheigth : " + this.height +"\ngender : " + this.gender);
    }
}
