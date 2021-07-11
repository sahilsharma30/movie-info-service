package io.codezone.movieinfoservice.controller;


import io.codezone.movieinfoservice.models.Movie;
import io.codezone.movieinfoservice.models.MovieList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MoviesInfoController {

    @GetMapping("/getMovies")
    public MovieList getMoviesList(){
        MovieList movieList = new MovieList();
        List<Movie> movies = new ArrayList<>();
        movies.add(createMovie("one","Avengers"));
        movies.add(createMovie("two","titans"));
        movieList.setMovies(movies);
        return movieList;
    }

    @GetMapping("/testMovie")
    public Movie getMovie(){
        return createMovie("1234","Transformers");
    }

    @GetMapping("/{movieId}")
    public Movie getMoviesList(@PathVariable("movieId") String movieId) {

        Map<String , Movie> movieMap = new HashMap<>();
        movieMap.put("123",createMovie("123","Transformers"));
        movieMap.put("234",createMovie("234","Avengers"));
        movieMap.put("567",createMovie("567","Batman"));

        if(movieMap.containsKey(movieId)){
            return movieMap.get(movieId);
        }
        return null;

        //return createMovie(movieId,"Transformers");
    }

    public Movie createMovie(String movieId, String name) {

        return new Movie(movieId,name);
    }

}
