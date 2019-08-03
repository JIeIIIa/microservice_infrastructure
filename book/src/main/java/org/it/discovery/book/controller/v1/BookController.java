package org.it.discovery.book.controller.v1;

import java.util.List;
import lombok.AllArgsConstructor;
import org.it.discovery.book.domain.Book;
import org.it.discovery.book.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("bookController_v1")
@AllArgsConstructor
public class BookController {

  private final BookRepository bookRepository;

  @GetMapping("/api/v1/book")
  public List<Book> getBooks() {
    return bookRepository.getBooks();
  }

  @GetMapping("/api/v1/book/{id}")
  public Book getBook(@PathVariable("id") int id) {
    return bookRepository.findBookById(id);
  }

  @PostMapping("/api/v1/book")
  public void saveBook(@RequestBody Book book) {
    bookRepository.saveBook(book);
  }

  public void updateBook(Book book) {
    bookRepository.saveBook(book);
  }

}
