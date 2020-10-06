package com.geekydroid.android_learnings;

import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("student_name")
    private String name;

    @SerializedName("student_city")
    private String city;

    @SerializedName("student_age")
    private int age;

    @SerializedName("marks")
    private Marks marks;

    public Student(String name, String city, int age, Marks marks) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}
