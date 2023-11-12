package com.epam.onlinebookstoreapi.repository;

import com.epam.onlinebookstoreapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCaseOrAuthor_NameContainingIgnoreCaseOrGenre_NameContainingIgnoreCase(String keyword, String keyword1, String keyword2);

}
