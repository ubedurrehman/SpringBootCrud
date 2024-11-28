package com.example.springboot.services;

import com.example.springboot.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookServices {

    private static List<Book> list=new ArrayList<>();
    static{ 
        list.add(new Book(12,"java Complete Reference ","XYZ"));
        list.add(new Book(363,"Head First to java","ABC"));
        list.add(new Book(1236,"Think,mmmn in java ","BCD"));
        list.add(new Book(1236,"Thinkin java ","25"));
    }

    public List<Book> getAllBooks(){
        return list;
    }

    public Book getBookById(int id){
        Book book=null;
       book = list.stream().filter(e->e.getId()==id).findFirst().get();
       return book;
    }

    public Book addBook(Book b){
       list.add(b);
        return b;
    }

    public void deleteBook(int bid){
        list = list.stream().filter(book ->book.getId()!=bid).
                collect(Collectors.toList());
    }

    public void updateBook(Book book, int bookId){
        list = list.stream().map(b->{
            if(b.getId()==bookId){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
                return b;
        }).collect(Collectors.toList());

    }


}
