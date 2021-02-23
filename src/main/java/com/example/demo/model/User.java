package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {
    private int id;
    private String name;
    private String password;
    private String salt;
    private String headUrl;
}
