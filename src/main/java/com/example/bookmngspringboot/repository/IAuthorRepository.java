package com.example.bookmngspringboot.repository;

import com.example.bookmngspringboot.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepository extends JpaRepository<Author,Long> {


}
