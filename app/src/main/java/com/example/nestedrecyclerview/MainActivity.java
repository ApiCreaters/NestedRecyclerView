package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainRecyclerView = findViewById(R.id.mainRecyclerView);

        ArrayList arrayList = new ArrayList<>();

//        list
        List<String> list1 = new ArrayList<>();
        list1.add("Fast Item 1");
        list1.add("Fast Item 2");
        list1.add("Fast Item 3");
        list1.add("Fast Item 4");
        list1.add("Fast Item 5");

        List<String> list2 = new ArrayList<String>();
        list2.add("Second Item 1");
        list2.add("Second Item 2");
        list2.add("Second Item 3");

        List<String> list3 = new ArrayList<String>();
        list3.add("Thared Item 1");
        list3.add("Thared Item 2");
        list3.add("Thared Item 3");
        list3.add("Thared Item 4");
        list3.add("Thared Item 5");
        list3.add("Thared Item 6");
        list3.add("Thared Item 7");
        list3.add("Thared Item 8");

        List<String> list4 = new ArrayList<String>();
        list4.add("Fourth Item 1");
        list4.add("Fourth Item 2");
        list4.add("Fourth Item 3");
        list4.add("Fourth Item 4");
        list4.add("Fourth Item 5");
        list4.add("Fourth Item 6");

        List<String> list5 = new ArrayList<String>();
        list5.add("Five Item 1");
        list5.add("Five Item 2");
        list5.add("Five Item 3");
        list5.add("Five Item 4");
        list5.add("Five Item 5");

        List<String> list6 = new ArrayList<String>();
        list6.add("Six Item 1");
        list6.add("Six Item 2");
        list6.add("Six Item 3");
        list6.add("Six Item 4");

        List<String> list7 = new ArrayList<String>();
        list7.add("Seven Item 1");
        list7.add("Seven Item 2");
        list7.add("Seven Item 3");
        list7.add("Seven Item 4");
        list7.add("Seven Item 5");
        list7.add("Seven Item 6");
        list7.add("Seven Item 7");
        list7.add("Seven Item 8");
        list7.add("Seven Item 9");
        list7.add("Seven Item 10");
        list7.add("Seven Item 11");

        List<String> list8 = new ArrayList<String>();
        list8.add("Eight Item 1");
        list8.add("Eight Item 2");

        arrayList.add(new DataModel(list1,"fast Semester"));
        arrayList.add(new DataModel(list2,"Second Semester"));
        arrayList.add(new DataModel(list3,"Therd Semester"));
        arrayList.add(new DataModel(list4,"Four Semester"));
        arrayList.add(new DataModel(list5,"Five Semester"));
        arrayList.add(new DataModel(list6,"Six Semester"));
        arrayList.add(new DataModel(list7,"Seven Semester"));
        arrayList.add(new DataModel(list8,"Eight Semester"));

        MainAdapter adapter = new MainAdapter(arrayList);
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mainRecyclerView.setAdapter(adapter);

    }
}