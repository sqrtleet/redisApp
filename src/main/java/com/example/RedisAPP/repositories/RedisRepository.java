package com.example.RedisAPP.repositories;

import java.util.Map;
import java.util.Set;

import com.example.RedisAPP.models.Movie;

public interface RedisRepository {

    Map<Object, Object> findAllMovies();

    void add(Movie movie);

    void delete(String id);

    Movie findMovie(String id);

}
