package io.codezone.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieList {

    List<Movie> movies;

//    public MovieList() {
//    }
//
//    public MovieList(List<Movie> movies) {
//        this.movies = movies;
//    }
//
//    public List<Movie> getMovies() {
//        return movies;
//    }
//
//    public void setMovies(List<Movie> movies) {
//        this.movies = movies;
//    }
}
