package workshop.spring5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import workshop.spring5.model.Book;

import javax.validation.Valid;

@Controller
@RequestMapping("books")
public class BookController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("add-book", "book", new Book());
    }

    @RequestMapping(value = "/process-form", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("book")Book book,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("id", book.getId());
        model.addAttribute("title", book.getTitle());
        model.addAttribute("isbn", book.getIsbn());
        model.addAttribute("author", book.getAuthor());
        return "submitted-book";
    }
}
