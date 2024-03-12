package dev.dani.api_movies.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dani.api_movies.models.Movie;
import dev.dani.api_movies.services.MovieService;
// import dev.dani.api_movies.models.Movie;

@RestController
@RequestMapping (path = "${api-endpoint}/api_movies")

public class MovieController {
    MovieService service;

    public MovieController (MovieService service){
        this.service = service;
    }

     public MovieService getService () {
         return service;
     }
      @GetMapping(path = "")
    public List<Movie> index() {

        List<Movie> movies = service.getAll();
        return movies;

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Movie> show(@PathVariable("id") Long id) throws Exception {

        Movie movie = service.getById(id);

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(movie);
    }

    @PostMapping(path = "")
    public ResponseEntity<Movie> create(@RequestBody Movie movie) {

        Movie newMovie = service.save(movie);

        return ResponseEntity.status(201).body(newMovie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> update(@PathVariable("id") Long id, @RequestBody Movie movie) throws Exception {

        Movie updatedMovie = service.update(id, movie);

        return ResponseEntity.status(200).body(updatedMovie);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<HttpStatus> remove(@PathVariable("id") Long id) throws Exception { 

        service.delete(id);

        return new ResponseEntity<>(HttpStatus.valueOf(204));
    }
}
