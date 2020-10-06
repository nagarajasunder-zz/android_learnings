package com.geekydroid.android_learnings;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

//        Student student = new Student("naga", "cbe", 21, new Marks("50", "50"));
//
//        String json = gson.toJson(student);
//        Log.d(TAG, "onCreate: " + json);

        String json = "{\"student_age\":22,\"student_city\":\"mdu\",\"marks\":{\"english\":\"50\",\"tamil\":\"80\"},\"student_name\":\"ajay\"}";

        Student student = gson.fromJson(json, Student.class);
        Log.d(TAG, "onCreate: " + student.toString());
    }
}