package dev.dani.api_movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.dani.api_movies.models.Year;

public interface YearRepository extends JpaRepository<Year,Long> {

}
