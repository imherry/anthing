package com.example.anything.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // 自动生成getter/setter
@NoArgsConstructor  // 无参构造
@AllArgsConstructor // 全参构造

public class Book {
private long id;
private String name;
private String author;
private double price;
private int stock;







    }
