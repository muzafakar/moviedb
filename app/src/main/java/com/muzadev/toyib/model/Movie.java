package com.muzadev.toyib.model;

import java.io.Serializable;

/**
 * Created by zulfakar on 29/10/18.
 * For educational purposes
 */
public class Movie implements Serializable {
    private String title;
    private String description;
    private String imageUrl;

    public Movie() {
    }

    public Movie(String title, String description, String imageUrl) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
