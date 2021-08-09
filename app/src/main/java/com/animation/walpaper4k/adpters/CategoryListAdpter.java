package com.animation.walpaper4k.adpters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.animation.walpaper4k.CategoryWallpaper;
import com.animation.walpaper4k.ExpandCategory;
import com.animation.walpaper4k.R;
import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CategoryListAdpter extends RecyclerView.Adapter<CategoryListAdpter.MyCategory> {
    ArrayList<String> imagelist;
    ArrayList<String> titlelist;

    public CategoryListAdpter(ArrayList<String> imagelist, ArrayList<String> titlelist) {
        this.imagelist = imagelist;
        this.titlelist = titlelist;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyCategory onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_image_item, parent, false);

        return new MyCategory(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull final CategoryListAdpter.MyCategory holder, final int position) {
        Glide.with(holder.imageView.getContext()).load(imagelist.get(position)).into(holder.imageView);
        holder.title.setVisibility(View.VISIBLE);
        holder.title.setText(titlelist.get(position));
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (titlelist.get(position).equals("actor")) {
                    ArrayList<String> imgArrayList = new ArrayList<>();
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
                    Intent i = new Intent(holder.imageView.getContext(), ExpandCategory.class);
                    i.putExtra("imagelist", imgArrayList);
                    holder.imageView.getContext().startActivity(i);


                } else if (titlelist.get(position).equals("marvel")) {
                    ArrayList<String> imgArrayList = new ArrayList<>();
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
                    Intent i = new Intent(holder.imageView.getContext(), ExpandCategory.class);
                    i.putExtra("imagelist", imgArrayList);
                    holder.imageView.getContext().startActivity(i);


                } else if (titlelist.get(position).equals("Anime")) {
                    ArrayList<String> imgArrayList = new ArrayList<>();
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
                    Intent i = new Intent(holder.imageView.getContext(), ExpandCategory.class);
                    i.putExtra("imagelist", imgArrayList);
                    holder.imageView.getContext().startActivity(i);


                } else if (titlelist.get(position).equals("Hot")) {
                    ArrayList<String> imgArrayList = new ArrayList<>();
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
                    Intent i = new Intent(holder.imageView.getContext(), ExpandCategory.class);
                    i.putExtra("imagelist", imgArrayList);
                    holder.imageView.getContext().startActivity(i);

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return titlelist.size();
    }

    public static class MyCategory extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title;

        public MyCategory(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);

        }
    }
}
