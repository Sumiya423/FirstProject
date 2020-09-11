package com.example.projectone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MyAdaptor extends BaseAdapter {
    String[] richName;
    String[] topRich;
    int[] image;
    Context context;


    public MyAdaptor(Context context,String[] richMan,String[]topRich, int[] image ) {
        this.context = context;
        this.image = image;
        this.richName = richMan;
        this.topRich=topRich;

    }

    @Override
    public int getCount() {

        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.single_view, null, false);
        }
        ImageView imageView=view.findViewById(R.id.singleImageId);
        imageView.setImageResource(image[position]);

        TextView textView1=view.findViewById(R.id.singleNameId);
        textView1.setText(richName[position]);

        TextView textView2=view.findViewById(R.id.singleTopId);
        textView2.setText(topRich[position]);




        return view;
    }
}
