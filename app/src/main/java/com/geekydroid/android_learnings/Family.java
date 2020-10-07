package com.geekydroid.android_learnings;

import com.google.gson.annotations.SerializedName;

public class Family {

    @SerializedName("role")
    private String role;

    @SerializedName("age")
    private int age;

    public Family(String role, int age) {
        this.role = role;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nFamily{" +
                "role='" + role + '\'' +
                ", age=" + age +
                '}';
    }
}
