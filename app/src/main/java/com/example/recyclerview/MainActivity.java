package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView courseRV = findViewById(R.id.idRVCourse);

        // Here, we have created new array list and added data to it
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("Lokesh Arora", 4, R.drawable.editlokesh));
        courseModelArrayList.add(new CourseModel("Android Developer", 3, R.drawable.editlokesh));
        courseModelArrayList.add(new CourseModel("Krishna Devotee", 4, R.drawable.editlokesh));
        courseModelArrayList.add(new CourseModel("traveller", 4, R.drawable.editlokesh));
        courseModelArrayList.add(new CourseModel("future", 4, R.drawable.editlokesh));
        courseModelArrayList.add(new CourseModel("future", 4, R.drawable.editlokesh));
        courseModelArrayList.add(new CourseModel("future", 4, R.drawable.editlokesh));

        // we are initializing our adapter class and passing our arraylist to it.
        CourseAdapter courseAdapter = new CourseAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }
}