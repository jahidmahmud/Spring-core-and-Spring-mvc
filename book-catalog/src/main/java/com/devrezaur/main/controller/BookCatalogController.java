package com.devrezaur.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.devrezaur.main.model.Book;
import com.devrezaur.main.service.BookCatalogService;

@Controller
public class BookCatalogController {

	BookCatalogService bookCatalogService;

	public BookCatalogController(BookCatalogService bookCatalogService) {
		this.bookCatalogService = bookCatalogService;
	}

	@GetMapping("/")
	public ModelAndView getAllBooks() {
		ModelAndView modelAndView = new ModelAndView("home-page");
		modelAndView.addObject("booklist", this.bookCatalogService.getAllBooks());

		return modelAndView;
	}

	@GetMapping("/book/{id}")
	public ModelAndView getBookById(@PathVariable int id) {
		ModelAndView modelAndView = new ModelAndView("home-page");
		modelAndView.addObject("book", this.bookCatalogService.getBookById(id));
		modelAndView.addObject("booklist", this.bookCatalogService.getAllBooks());

		return modelAndView;
	}
	
	@PostMapping("/book/add")
	public ModelAndView addBook(@ModelAttribute Book book) {
		String message = this.bookCatalogService.addBook(book);

		ModelAndView modelAndView = new ModelAndView("home-page");
		modelAndView.addObject("message", message);
		modelAndView.addObject("booklist", this.bookCatalogService.getAllBooks());

		return modelAndView;
	}

	@PostMapping("/book/update")
	public ModelAndView updateBook(@ModelAttribute Book book) {
		String message = this.bookCatalogService.updateBook(book);

		ModelAndView modelAndView = new ModelAndView("home-page");
		modelAndView.addObject("message", message);
		modelAndView.addObject("booklist", this.bookCatalogService.getAllBooks());

		return modelAndView;
	}

}
