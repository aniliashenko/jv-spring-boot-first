package jv.anton.spring_first.service;

import jv.anton.spring_first.model.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);
    List findAll();
}
