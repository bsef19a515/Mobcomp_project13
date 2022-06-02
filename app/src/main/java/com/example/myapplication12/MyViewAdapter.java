package com.example.myapplication12;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;



import java.util.ArrayList;

public class MyViewAdapter extends ArrayAdapter<Book> {
    public MyViewAdapter(@NonNull Context context, ArrayList<Book> bookArrayList) {
        super(context, 0, bookArrayList);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Book book = getItem(position);
        if(convertView==null)
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.activity_main2, parent, false);
        TextView textViewName = convertView.findViewById(R.id.textView2);
        TextView textViewAuthor = convertView.findViewById(R.id.textView3);
        ImageView imageView = convertView.findViewById(R.id.imageView4);

        textViewName.setText(book.getName());
        textViewAuthor.setText(book.getAuthor());
        imageView.setImageResource(book.getImageID());

//        textViewName.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("onClick: ",book.getName());
//            }
//        });
        return convertView;


    }
}
