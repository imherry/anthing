package com.example.anything.controller;

import com.example.anything.model.Book;
import com.example.anything.servive.BoookService;
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

    @GetMapping("/test")
    @ResponseBody  // 直接返回字符串，不找页面
    public String test() {
        return "项目运行成功！";
    }


    @Autowired
    private BoookService boookService;

    @GetMapping
    public String hello(Model model) {
        List<Book> books=boookService.findall();
        // 5. 把数据放进Model（数据背包）
        model.addAttribute("bookList", books);
        model.addAttribute("totalCount", books.size());

        return "book/list";

    }



}
