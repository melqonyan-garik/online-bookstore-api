package com.epam.onlinebookstoreapi.service;

import com.epam.onlinebookstoreapi.model.Book;
import com.epam.onlinebookstoreapi.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<Book> searchBooks(String keyword) {
        // Implement a custom method in the repository for searching by title, author, or genre
        return bookRepository.findByTitleContainingIgnoreCaseOrAuthor_NameContainingIgnoreCaseOrGenre_NameContainingIgnoreCase(keyword, keyword, keyword);
    }
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
