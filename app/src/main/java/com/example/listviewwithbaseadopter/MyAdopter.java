package com.example.listviewwithbaseadopter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdopter extends BaseAdapter {
    Context ri;
    String[] n;
    String[] c;
    int[] i;
    LayoutInflater inflater;

    public MyAdopter(Context ri, String[] n, String[] c, int[] i) {
        this.ri = ri;
        this.n = n;
        this.c = c;
        this.i = i;
        inflater=LayoutInflater.from(ri);
    }

    @Override
    public int getCount() {
        return n.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.mu_custom_list,null);
        TextView nn=convertView.findViewById(R.id.nn);
        TextView cc=convertView.findViewById(R.id.cc);
        ImageView ii=convertView.findViewById(R.id.ii);

        nn.setText(n[position]);
        cc.setText(c[position]);
        ii.setImageResource(i[position]);
        return convertView;
    }
}
