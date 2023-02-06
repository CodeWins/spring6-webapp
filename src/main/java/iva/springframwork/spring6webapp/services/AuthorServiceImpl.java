package iva.springframwork.spring6webapp.services;

import iva.springframwork.spring6webapp.doman.Author;
import iva.springframwork.spring6webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

/**
 * Created By iVa on 2/5/2023.
 */
@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        Iterable<Author> allAuthors = authorRepository.findAll();
        for(Author author:allAuthors){
            System.out.println(author.getId()+" "+author.getFirstName());
        }
        return allAuthors;
    }
}
