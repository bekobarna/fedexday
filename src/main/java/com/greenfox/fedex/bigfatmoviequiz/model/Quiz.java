package com.greenfox.fedex.bigfatmoviequiz.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name="quiz_movie",
            joinColumns=@JoinColumn(name="quiz_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="movie_id", referencedColumnName="id"))
    List<Movie> movies;

    public Quiz() {
        this.movies = new ArrayList<>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
