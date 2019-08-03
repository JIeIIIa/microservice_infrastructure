package org.it.discovery.book.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.it.discovery.book.domain.Book;
import org.it.discovery.book.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookController {

  private final BookRepository bookRepository;

  @GetMapping("/book")
  public List<Book> getBooks() {
    return bookRepository.getBooks();
  }

  @GetMapping("/book/{id}")
  public Book getBook(@PathVariable("id") int id) {
    return bookRepository.findBookById(id);
  }

  @PostMapping("/book")
  public void saveBook(@RequestBody Book book) {
    bookRepository.saveBook(book);
  }

  public void updateBook(Book book) {
    bookRepository.saveBook(book);
  }

}
