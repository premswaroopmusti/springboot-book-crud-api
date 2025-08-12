package com.example.CRUD_API_Book_Resource.controller;

import com.example.CRUD_API_Book_Resource.model.Book;
import com.example.CRUD_API_Book_Resource.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){

       return new ResponseEntity<>(service.getBooks(), HttpStatus.OK);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable long id){

        Book book1 = service.getBookById(id);

        if (book1 != null) {
            return new ResponseEntity<>(book1, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/book")
    public ResponseEntity<?> addBook(@RequestBody Book book){
           try {
               Book book1 = service.addBook(book);
               return new ResponseEntity<>(book1, HttpStatus.CREATED);
           }
           catch(Exception e) {
               return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
           }
    }

    @PutMapping("/book")
    public ResponseEntity<?> updateBook(@RequestBody Book book){
            try{
                Book book1 = service.updateBook(book);
                return new ResponseEntity<>(book1,HttpStatus.OK);
            }
            catch(Exception e){
                return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            }

    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> deletebook(@PathVariable long id) {

        Book book1 = service.getBookById(id);

        if (book1 != null) {
            service.deleteBook(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Product Not Found",HttpStatus.NOT_FOUND);
        }
    }
}
