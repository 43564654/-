package com.example.project1.pojo;

public class User {
    private Integer id;

    private String name;

    private Short age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public User( Integer id,String name, Short age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }





}
