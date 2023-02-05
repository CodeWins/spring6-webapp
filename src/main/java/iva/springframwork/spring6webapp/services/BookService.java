package iva.springframwork.spring6webapp.services;

import iva.springframwork.spring6webapp.doman.Book;

/**
 * Created By iVa on 2/4/2023.
 */
public interface BookService {
    Iterable<Book> findAll();
}
