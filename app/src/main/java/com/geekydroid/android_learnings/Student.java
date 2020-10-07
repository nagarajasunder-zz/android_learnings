package com.geekydroid.android_learnings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("student_name")
    @Expose
    private String name;

    @SerializedName("student_city")
    @Expose
    private String city;

    @SerializedName("student_age")
    @Expose
    private int age;

    @SerializedName("password")
    @Expose(serialize = false,deserialize = false)
    private String password;

    public Student(String name, String city, int age, String password) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
