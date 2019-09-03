package com.zb.entity;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer id;
    private String name;
    private Integer price;
    private Integer uid;

    public Order() {
    }

    public Order(Integer id, String name, Integer price, Integer uid) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.uid = uid;
    }

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
