package com.y1forcode.librarydemo.repository;

import com.y1forcode.librarydemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
