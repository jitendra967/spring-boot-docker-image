package com.docker.springbootdockerimage.dao;

import com.docker.springbootdockerimage.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book,Integer> {
}
