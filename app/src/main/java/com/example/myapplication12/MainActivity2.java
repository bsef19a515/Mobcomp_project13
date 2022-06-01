package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


public class MainActivity2 extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayList<Book> bookArrayList = new ArrayList<Book>();
        bookArrayList.add(new Book("Ali", "Alpha", R.drawable.a1));
        bookArrayList.add(new Book("Saad", "Beta",  R.drawable.a2));
        bookArrayList.add(new Book("Aila", "Alpha",  R.drawable.a3));
        bookArrayList.add(new Book("Aiman", "Beta", R.drawable.a4));
        MyViewAdapter adapter = new MyViewAdapter(this, bookArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}


