package com.geekydroid.android_learnings;

import com.google.gson.annotations.SerializedName;

public class Marks {

    @SerializedName("tamil")
    private String tamil;

    @SerializedName("english")
    private String english;

    public Marks(String tamil, String english) {
        this.tamil = tamil;
        this.english = english;
    }

    @Override
    public String toString() {
        return "\nMarks{" +
                "tamil='" + tamil + '\'' +
                ", english='" + english + '\'' +
                '}';
    }
}

