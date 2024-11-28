package com.example.springboot.controllers;

import com.example.springboot.entities.Book;
import com.example.springboot.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookServices bookServices;
        
    //get all book
    @GetMapping("/books")
    public List<Book> getBooks() {
        return this.bookServices.getAllBooks();
    }

    //single book
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id){
        return bookServices.getBookById(id);
    }

    //new book
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
       Book b = this.bookServices.addBook(book);
       return b;
    }

    //delete book
    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId){
        this.bookServices.deleteBook(bookId);
    }

    //update book
    @PutMapping("/books/{bookId}")
    public  Book UpdateBook(@RequestBody Book book,@PathVariable ("bookId") int bookId){
        this.bookServices.updateBook(book,bookId);
        return book;
    }
    

}
