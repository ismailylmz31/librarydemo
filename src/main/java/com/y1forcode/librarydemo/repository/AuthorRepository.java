package com.y1forcode.librarydemo.repository;

import com.y1forcode.librarydemo.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
