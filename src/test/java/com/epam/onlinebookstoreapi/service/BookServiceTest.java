package com.epam.onlinebookstoreapi.service;

import com.epam.onlinebookstoreapi.model.Author;
import com.epam.onlinebookstoreapi.model.Book;
import com.epam.onlinebookstoreapi.model.Genre;
import com.epam.onlinebookstoreapi.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void testCreateBook() {
        Book book = new Book();
        book.setTitle("Test Book");
        book.setAuthor(new Author());
        book.setGenre(new Genre());
        book.setPrice(BigDecimal.valueOf(29.99));
        book.setQuantityAvailable(10);

        Book createdBook = bookService.saveBook(book);

        assertNotNull(createdBook.getId());
    }

    @Test
    public void testGetBookById() {
        Long bookId = 1L;

        Book book = bookService.getBookById(bookId);
        assertNotNull(book);
    }

    @Test
    public void testUpdateBook() {
        Long bookId = 1L;

        Book existingBook = bookService.getBookById(bookId);
        assertNotNull(existingBook);

        existingBook.setPrice(BigDecimal.valueOf(39.99));

        Book updatedBook = bookService.saveBook(existingBook);
        assertEquals(BigDecimal.valueOf(39.99), updatedBook.getPrice());
    }

    @Test
    public void testDeleteBook() {
        Long bookId = 1L;

        bookService.deleteBook(bookId);
        assertNull(bookService.getBookById(bookId));
    }
}
