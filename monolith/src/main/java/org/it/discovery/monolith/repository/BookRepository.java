package org.it.discovery.monolith.repository;

import org.it.discovery.monolith.domain.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getBooks();

    Book findBookById(int id);

    void saveBook(Book book);

    void deleteBook(int id);

}
