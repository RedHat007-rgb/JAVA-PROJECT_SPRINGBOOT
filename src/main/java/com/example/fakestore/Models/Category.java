package com.example.fakestore.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
    public long id;
    public String title;

    public Category(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category(long id, String title){
        this.id=id;
        this.title=title;
    }

}
