package iva.springframwork.spring6webapp.repositories;

import iva.springframwork.spring6webapp.doman.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By iVa on 2/4/2023.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
