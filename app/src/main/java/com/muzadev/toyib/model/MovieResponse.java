package com.muzadev.toyib.model;

import java.util.List;

/**
 * Created by zulfakar on 29/10/18.
 * For educational purposes
 */
public class MovieResponse {
    private List<Movie> results;

    public MovieResponse() {
    }

    public MovieResponse(List<Movie> results) {
        this.results = results;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }
}
