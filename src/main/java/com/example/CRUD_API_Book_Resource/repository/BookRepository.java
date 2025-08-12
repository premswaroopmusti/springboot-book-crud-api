package com.example.CRUD_API_Book_Resource.repository;

import com.example.CRUD_API_Book_Resource.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
