package com.animation.walpaper4k;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.Myclass> {

    SecondPage secondPage;
    ArrayList<String> imgArrayList;
    public RecyclerViewAdapter(SecondPage secondPage, ArrayList<String> imgArrayList) {

        this.imgArrayList=imgArrayList;
        this.secondPage=secondPage;
    }

    @NonNull
    @Override
    public Myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(secondPage).inflate(R.layout.recycler_image_item,parent,false);

        return new Myclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myclass holder, final int position) {
        Glide.with(secondPage).load(imgArrayList.get(position)).into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(secondPage,WalpaperPagerActivity.class);
                i.putExtra("list",imgArrayList);
                i.putExtra("pos",position);
                secondPage.startActivity(i);
            }
        });

    }



    @Override
    public int getItemCount() {

        return imgArrayList.size();
    }
    class Myclass extends RecyclerView.ViewHolder {
        ImageView imageView;
        public Myclass(@NonNull View itemView) {

            super(itemView);
            imageView=itemView.findViewById(R.id.image);
        }
    }
}
