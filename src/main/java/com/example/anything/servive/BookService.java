package com.example.anything.servive;


import com.example.anything.BookRepository;
import com.example.anything.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> findall(){

        System.out.println("📖 【业务逻辑】查询所有图书");
        return bookRepository.findall();
//        return Book.stream()
//            .filter(book -> book.getStock() > 0)  // 只返回有库存的
//            .collect(Collectors.toList());
//        // 可以添加业务逻辑：过滤、排序、计算等

    }



    }

