package com.docker.springbootdockerimage;

import com.docker.springbootdockerimage.dao.BookRepository;
import com.docker.springbootdockerimage.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringBootDockerImageApplication {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/message")
    public String getMessage() {
        return "Hello World!";
    }

    @GetMapping("/ping")
    public String ping() {
        return "the project is up and running!";
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
    return bookRepository.save(book);
    }

    @GetMapping
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerImageApplication.class, args);
    }

}
