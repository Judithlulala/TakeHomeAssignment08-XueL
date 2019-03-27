package com.example.teentime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Article>articles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialData();
        RecyclerView recyclerView= findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ArticleAdapter(articles,this));
    }

    private void initialData(){
        articles=new ArrayList<>();
        articles.add(new Article(R.mipmap.number1,R.string.Article_1));
        articles.add(new Article(R.mipmap.number2,R.string.Article_2));
        articles.add(new Article(R.mipmap.number3,R.string.Article_3));
        articles.add(new Article(R.mipmap.number4,R.string.Article_4));
        articles.add(new Article(R.mipmap.number5,R.string.Article_5));
        articles.add(new Article(R.mipmap.number6,R.string.Article_6));
        articles.add(new Article(R.mipmap.number7,R.string.Article_7));

    }
}
