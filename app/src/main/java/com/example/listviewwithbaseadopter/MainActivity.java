package com.example.listviewwithbaseadopter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Context ri;
    String[] n = {"zohaib", "rizwan", "zeeshan1", "zeeshan2", "mahmood", "irfan", "gulfam", "ahmad"};
    String[] c = {"207", "152", "5133", "335", "100", "210", "5051", "111"};
    int[] i = {R.drawable.zo, R.drawable.riz, R.drawable.z1, R.drawable.z2, R.drawable.ma
            , R.drawable.ir, R.drawable.gu, R.drawable.ah};
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.l);

        MyAdopter adopter=new MyAdopter(MainActivity.this,n,c,i);
        l.setAdapter(adopter);
        adopter.notifyDataSetChanged();
    }
}