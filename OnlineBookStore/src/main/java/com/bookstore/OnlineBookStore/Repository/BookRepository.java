package com.bookstore.OnlineBookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bookstore.OnlineBookStore.entity.Book;

@CrossOrigin("http://localhost:4200")
public interface BookRepository  extends JpaRepository<Book, Long>{

}
