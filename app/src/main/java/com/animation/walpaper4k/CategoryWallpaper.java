package com.animation.walpaper4k;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.animation.walpaper4k.adpters.CategoryListAdpter;

import java.util.ArrayList;

public class CategoryWallpaper extends AppCompatActivity {
    RecyclerView recyclerView;
    CategoryListAdpter categoryListAdpter;
    ArrayList<String> imagelist = new ArrayList<>();
    ArrayList<String> titlelist= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_wallpaper);
        recyclerView =findViewById(R.id.category_rec_view);
        imagelist.add("https://tvline.com/wp-content/uploads/2019/08/daytime-emmys-younger-category-merge.jpg");
        imagelist.add("https://wallpapercave.com/wp/wp4330394.jpg");
        imagelist.add("https://cdn.wallpapersafari.com/73/10/rTmSMB.jpg");
        imagelist.add("https://lh3.googleusercontent.com/proxy/_k0ECB6McSLS06l7NNJwdsfmkoTopp9F8mmS1oHFrXFKr6vsZQCPUE2ONY30U-2Z4-_RSl5nmndcBR711q7FikF2YQSGPwv5kuUL7qqgGztGE7MZiupztkBvzU6HK2oJ2-tDXw0NqH-m");


        titlelist.add("actor");
        titlelist.add("marvel");

        titlelist.add("Anime");
        titlelist.add("Hot");
        categoryListAdpter = new CategoryListAdpter(imagelist,titlelist);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(categoryListAdpter);


    }
}