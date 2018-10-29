package com.muzadev.toyib.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.muzadev.toyib.R;
import com.muzadev.toyib.model.Movie;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by zulfakar on 29/10/18.
 * For educational purposes
 */
public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    private Context context;
    private List<Movie> movieList;

    public MovieAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_moview, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bind(movieList.get(i));
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle;
        private TextView tvDescription;
        private Button btnReadMore;
        private ImageView imgMovie;

        public ViewHolder(@NonNull View item) {
            super(item);

            tvTitle = item.findViewById(R.id.tvTitle);
            tvDescription = item.findViewById(R.id.tvDescription);
            imgMovie = item.findViewById(R.id.imgMovie);
            btnReadMore = item.findViewById(R.id.btnReadMore);
        }

        public void bind(final Movie movie) {
            tvTitle.setText(movie.getTitle());
            tvDescription.setText(movie.getDescription());
            Picasso.get().load(movie.getImageUrl()).fit().centerCrop().into(imgMovie);

            btnReadMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, movie.getTitle(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
