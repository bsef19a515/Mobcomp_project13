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
        bookArrayList.add(new Book("Reclaim Heart", "Yasmin Mogahed", R.drawable.a1));
        bookArrayList.add(new Book("We pray", "Ameenah",  R.drawable.a2));
        bookArrayList.add(new Book("Prayers pious", "Omer Suleiman",  R.drawable.a3));
        bookArrayList.add(new Book("The Right Duties", "Abdul Ghaffar", R.drawable.a4));
        MyViewAdapter adapter = new MyViewAdapter(this, bookArrayList);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}


