package org.it.discovery.book.controller.v2;

import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.it.discovery.book.domain.Book;
import org.it.discovery.book.dto.v2.BookDTO;
import org.it.discovery.book.repository.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("bookController_v2")
@AllArgsConstructor
public class BookController {

  private final BookRepository bookRepository;

  private final DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();

  @GetMapping("/api/v2/book")
  public List<BookDTO> getBooks() {
    return bookRepository.getBooks()
        .stream()
        .map(book -> dozerBeanMapper.map(book, BookDTO.class))
        .collect(Collectors.toList());
  }

  @GetMapping("/api/v2/book/{id}")
  public BookDTO getBook(@PathVariable("id") int id) {
    return dozerBeanMapper.map(
        bookRepository.findBookById(id),
        BookDTO.class);
  }

  @PostMapping("/api/v2/book")
  public void saveBook(@RequestBody Book book) {
    bookRepository.saveBook(book);
  }

  public void updateBook(Book book) {
    bookRepository.saveBook(book);
  }

}
