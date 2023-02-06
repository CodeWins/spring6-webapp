package iva.springframwork.spring6webapp.controllers;

import iva.springframwork.spring6webapp.services.AuthorService;
import iva.springframwork.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By iVa on 2/4/2023.
 */

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public String getBooks(Model model){

        model.addAttribute("authors", authorService.findAll());


        return "authors";
    }
}
