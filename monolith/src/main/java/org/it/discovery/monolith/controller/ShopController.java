package org.it.discovery.monolith.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.it.discovery.monolith.domain.Book;
import org.it.discovery.monolith.repository.BookRepository;
import org.it.discovery.monolith.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ShopController {

    private static final String LIBRARY_NAME = "IT-Discovery library";

    private final BookRepository bookRepository;

    private final OrderService orderService;

    @GetMapping("/library")
    public String getLIBRARY_NAME() {
        return LIBRARY_NAME;
    }

    @GetMapping("/book")
    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") int id) {
        return bookRepository.findBookById(id);
    }

    @PostMapping("/book")
    public void saveBook(Book book) {
        bookRepository.saveBook(book);
    }

    @PutMapping("/book")
    public void updateBook(@RequestBody Book book) {
        bookRepository.saveBook(book);
    }

    public int createOrder(int bookId, int number, int customerId) {
        return orderService.createOrder(bookId, number, customerId).getId();
    }

    public void addBook(int orderId, int bookId, int number) {
        orderService.addBook(orderId, bookId, number);
    }

    public void completeOrder(int orderId) {
        orderService.complete(orderId);
    }

    public void deliver(int orderId) {
        orderService.deliver(orderId);
    }

    public void cancel(int orderId) {
        orderService.cancel(orderId);
    }

}
