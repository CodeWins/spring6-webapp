package iva.springframwork.spring6webapp.repositories;


import iva.springframwork.spring6webapp.doman.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By iVa on 2/4/2023.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
