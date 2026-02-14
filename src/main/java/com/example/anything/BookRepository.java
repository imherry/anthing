package com.example.anything;


import com.example.anything.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository  // 🏗️ 放进容器
    public class BookRepository {

        // 模拟数据库
        private Map<Long, Book> database = new ConcurrentHashMap<>();

        public BookRepository() {
            // 初始化测试数据
            database.put(1L, new Book(1L, "Java编程思想", "Bruce Eckel", 89.0, 10));
            database.put(2L, new Book(2L, "Spring实战", "Craig Walls", 79.0, 5));
            database.put(3L, new Book(3L, "MySQL必知必会", "Ben Forta", 49.0, 8));
        }

        public List<Book> findall() {
            System.out.println("💾 【数据访问】从数据库查询所有图书");
            return new ArrayList<>(database.values());
        }
    }





