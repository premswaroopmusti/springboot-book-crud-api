package com.example.CRUD_API_Book_Resource.service;

import com.example.CRUD_API_Book_Resource.model.Book;
import com.example.CRUD_API_Book_Resource.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

        @Autowired
        private BookRepository repo;

        public List<Book> getBooks(){

            return repo.findAll();
        }

        public Book getBookById(long id){
            return repo.findById(id).orElse(null);
        }

        public Book addBook(Book book){
            return repo.save(book);
        }

        public Book updateBook(Book book){
            return repo.save(book);
        }

        public void deleteBook(long id){
            repo.deleteById(id);
        }
}
