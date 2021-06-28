package com.kgc.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class LinkMan implements Serializable {
    private int id;
    private int age;
    private String name;
    private String sex;
    private String qq;
    private String address;
    private String email;
}
