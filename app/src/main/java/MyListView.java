import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication12.R;

public class MyListView extends ArrayAdapter {
    private final Activity context;
    private final String[] maintitle;
    private final String[] author;
    private final Integer[] imgid;

    public MyListView(Activity context, String[] maintitle, String[] author, Integer[] imgid) {
        super(context, R.layout.activity_main2, maintitle);
        this.context = context;
        this.maintitle = maintitle;
        this.author = author;
        this.imgid = imgid;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View singleEntityView=inflater.inflate(R.layout.activity_main2, null,true);
        TextView titleHeading =  singleEntityView.findViewById(R.id.textView2);
        ImageView imageView =  singleEntityView.findViewById(R.id.imageView4);
        TextView bookauthor = singleEntityView.findViewById(R.id.textView3);
        titleHeading.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        bookauthor.setText(author[position]);
        return singleEntityView;
    };

}

