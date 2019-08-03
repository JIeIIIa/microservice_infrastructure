package org.it.discovery.book.repository;

import java.util.List;
import org.it.discovery.book.domain.Book;

public interface BookRepository {

    List<Book> getBooks();

    Book findBookById(int id);

    void saveBook(Book book);

    void deleteBook(int id);

}
