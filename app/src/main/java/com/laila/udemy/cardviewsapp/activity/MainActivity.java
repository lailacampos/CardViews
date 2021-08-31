package com.laila.udemy.cardviewsapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.laila.udemy.cardviewsapp.R;
import com.laila.udemy.cardviewsapp.adapter.MyAdapter;
import com.laila.udemy.cardviewsapp.model.AppPost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<AppPost> appPostList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        // Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        // Configure adapter
        this.prepareAppPosts();
        MyAdapter myAdapter = new MyAdapter(appPostList);

        // Define Adapter
        recyclerView.setAdapter(myAdapter);
    }

    public void prepareAppPosts() {

        AppPost appPost = new AppPost("Laila Campos", "Just now", "#tbt Italy", R.drawable.imagem1);
        this.appPostList.add(appPost);

        appPost = new AppPost("Ricardo Schimid", "Yesterday", "#Some subtitle", R.drawable.imagem2);
        this.appPostList.add(appPost);

        appPost = new AppPost("Laila Campos", "2 days ago", "#Some other subtitle", R.drawable.imagem3);
        this.appPostList.add(appPost);

        appPost = new AppPost("Laila Campos", "1 week ago", "#I like big butts and I cannot lie", R.drawable.imagem4);
        this.appPostList.add(appPost);

        appPost = new AppPost("Laila Campos", "2 weeks ago", "#Dunno", R.drawable.imagem1);
        this.appPostList.add(appPost);

    }
}