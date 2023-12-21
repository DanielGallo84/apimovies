package dev.dani.api_movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.dani.api_movies.models.Movie;


public interface MovieRepository extends JpaRepository<Movie,Long> {

}
