package com.animation.walpaper4k;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SecondPage extends AppCompatActivity {
    RecyclerView rcMain;
    ArrayList<String> imgArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        imgArrayList.add("https://i.pinimg.com/originals/c2/8d/00/c28d00c15e57351e9f630d01ee91bfb0.png");
        imgArrayList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOCgeLH4uqPynKoJBZNnFyzHn_sNPR0ZsY5w&usqp=CAU");
        imgArrayList.add("https://i.pinimg.com/originals/a8/af/ae/a8afae6a9e8c7d5b4c808a040125f17b.jpg");
        imgArrayList.add("https://content.tupaki.com//twdata/2020/0920/photos/actress/Rashmika%20Mandanna%20Sensuous%20Poses/normal/Rashmika%20Mandanna%20Sensuous%20Poses_5.jpg");
        imgArrayList.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKV6DYJQNjz-NJ2v5FjKbL3cCMKfUuWZAeVw&usqp=CAU");
        imgArrayList.add("https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        imgArrayList.add("https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        imgArrayList.add("https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        imgArrayList.add("https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        imgArrayList.add("https://images.pexels.com/photos/799443/pexels-photo-799443.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        rcMain=findViewById(R.id.rcMain);
        rcMain.setLayoutManager(new GridLayoutManager(this,2));
        RecyclerViewAdapter recyclerViewAdapter= new RecyclerViewAdapter(SecondPage.this,imgArrayList);
        rcMain.setAdapter(recyclerViewAdapter);

    }
}