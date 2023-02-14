package com.todoapp;

import javax.persistence.*;

@Entity(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String title;

    @Column(name = "orders", nullable = false)
    public int order;

    @Column(nullable = false)
    public Boolean completed;
}
