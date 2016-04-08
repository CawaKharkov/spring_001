package com.app.rest.entiry;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="posts")
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;
    private long price;

    private Post() {}

    public Post(String description, long price) {
        this.description = description;
        this.price = price;

    }


}
