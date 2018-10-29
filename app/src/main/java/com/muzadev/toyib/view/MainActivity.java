package com.muzadev.toyib.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.muzadev.toyib.R;
import com.muzadev.toyib.adapter.MovieAdapter;
import com.muzadev.toyib.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMovie;
    private List<Movie> listMovie;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listMovie = new ArrayList<>();
        movieAdapter = new MovieAdapter(this, listMovie);
        useDummyData();

        rvMovie = findViewById(R.id.rvMovie);
        rvMovie.setLayoutManager(new LinearLayoutManager(this));
        rvMovie.setAdapter(movieAdapter);
    }

    private void useDummyData() {
        String imageUrl = "https://firebasestorage.googleapis.com/v0/b/eiuran-a1e83.appspot.com/o/dp.jpg?alt=media&token=03889b8a-225b-462d-aa4f-793619a5fc56";
        for (int i = 0; i < 10; i++) {
            listMovie.add(new Movie("title", "description", imageUrl));
        }

        movieAdapter.notifyDataSetChanged();
    }
}
