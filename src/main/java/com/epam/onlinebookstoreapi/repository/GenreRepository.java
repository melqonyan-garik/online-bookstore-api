package com.epam.onlinebookstoreapi.repository;

import com.epam.onlinebookstoreapi.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
