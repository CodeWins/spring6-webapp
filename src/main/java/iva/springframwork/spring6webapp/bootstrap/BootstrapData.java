package iva.springframwork.spring6webapp.bootstrap;

import iva.springframwork.spring6webapp.doman.Author;
import iva.springframwork.spring6webapp.doman.Book;
import iva.springframwork.spring6webapp.doman.Publisher;
import iva.springframwork.spring6webapp.repositories.AuthorRepository;
import iva.springframwork.spring6webapp.repositories.BookRepository;
import iva.springframwork.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created By iVa on 2/4/2023.
 */

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");


        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("567858");


        Publisher publishier = new Publisher();
        publishier.setPublisherName("My Publisher");
        publishier.setAddress("123 Main");

        Author ericSaved = authorRepository.save(eric);
        Author rodSaved = authorRepository.save(rod);

        Book dddSaved = bookRepository.save(ddd);
        Book neEJBSaved = bookRepository.save(noEJB);

        Publisher publisherSaved = publisherRepository.save(publishier);

        dddSaved.setPublisher(publisherSaved);
        neEJBSaved.setPublisher(publisherSaved);


        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(neEJBSaved);

        dddSaved.getAuthors().add(ericSaved);
        neEJBSaved.getAuthors().add(rodSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(neEJBSaved);
        System.out.println("In Bootstrap");
        System.out.println("Author Count:" + authorRepository.count());
        System.out.println("Book Count:" + bookRepository.count());
        System.out.println("Publisher Count:" + publisherRepository.count());
    }
}
