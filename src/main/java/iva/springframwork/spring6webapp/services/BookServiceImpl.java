package iva.springframwork.spring6webapp.services;

import iva.springframwork.spring6webapp.doman.Book;
import iva.springframwork.spring6webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

/**
 * Created By iVa on 2/4/2023.
 */

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
