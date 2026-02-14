package com.example.anything.controller;

import com.example.anything.model.Book;
import com.example.anything.servive.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

//    @GetMapping("/test-page")
//    public String testPage() {
//        return "test";  // 对应 test.html
//    }
    @GetMapping
    public String getAllBooks(Model model) {
        List<Book> books=bookService.findall();
        // 5. 把数据放进Model（数据背包）
        model.addAttribute("bookList", books);
        model.addAttribute("totalCount", books.size());

        return "book/list";

    }



}
