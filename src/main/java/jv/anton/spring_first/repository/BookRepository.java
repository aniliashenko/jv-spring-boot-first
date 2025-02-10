package jv.anton.spring_first.repository;

import jv.anton.spring_first.model.Book;

import java.util.List;

public interface BookRepository {
    Book save(Book book);
    List findAll();
}
