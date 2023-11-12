package com.epam.onlinebookstoreapi.repository;

import com.epam.onlinebookstoreapi.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
