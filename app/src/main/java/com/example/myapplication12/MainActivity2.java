package com.example.myapplication12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Book> bookArrayList = new ArrayList<>();
        bookArrayList.add(new Book("Reclaim your heart", "Alpha", R.drawable.a1));
        bookArrayList.add(new Book("This is why we pray", "Beta",  R.drawable.a2));
        bookArrayList.add(new Book("Prayers pious", "Alpha",  R.drawable.a3));
        bookArrayList.add(new Book("The Right Duties", "Beta", R.drawable.a4));
        MyViewAdapter adapter = new MyViewAdapter(this, bookArrayList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}


