package com.geekydroid.android_learnings;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

//        ArrayList<Family> families = new ArrayList<>();
//        families.add(new Family("Father", 50));
//        families.add(new Family("mother", 45));


//        Student student = new Student("naga", "cbe", 21, new Marks("50", "50"),families);
////
////        String json = gson.toJson(student);
////        Log.d(TAG, "onCreate: " + json);
//
//        String json = "{\"student_age\":22,\"student_city\":\"mdu\",\"marks\":{\"english\":\"50\",\"tamil\":\"80\"},\"student_name\":\"ajay\"}";
//
//        Student student = gson.fromJson(json, Student.class);
//        Log.d(TAG, "onCreate: " + student.toString());

//        String json = gson.toJson(student);
//        Log.d(TAG, "onCreate: "+json);

//        String json = "[{\"role\":\"Father\",\"age\":\"50\"},{\"role\":\"mother\",\"age\":\"45\"}]";
//        Family[] family = gson.fromJson(json, Family[].class);
//
//
//        for (int i = 0; i < family.length; i++) {
//            Log.d(TAG, "\nonCreate: " + family[i].toString());

        Student student = new Student("naga", "cbe", 21, "123");
//        String s = gson.toJson(student);
//        Log.d(TAG, "onCreate: " + s);

        String json = "{\"student_age\":25,\"student_city\":\"cbe\",\"student_name\":\"naga\",\"password\":\"123\"}";

        student = gson.fromJson(json,Student.class);
        Log.d(TAG, "onCreate: "+student.toString());

    }


}
