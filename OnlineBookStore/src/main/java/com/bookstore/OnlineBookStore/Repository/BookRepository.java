package com.bookstore.OnlineBookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.OnlineBookStore.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Long>{

}
