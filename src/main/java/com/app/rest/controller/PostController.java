package com.app.rest.controller;

import com.app.rest.entiry.Post;
import com.app.rest.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//@RestController
//@RequestMapping("/api/posts")
final class PostController {


    @Autowired
    private PostRepository rep;

    /**
     * Create a new todo entry.
     * @param newTodoEntry  The information of the created todo entry.
     * @return              The information of the created todo entry.
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Post create(@RequestBody @Valid Post newPost) {
   //     LOGGER.info("Creating a new todo entry by using information: {}", newTodoEntry);

        Post created = rep.save(newPost);
     //   LOGGER.info("Created a new todo entry: {}", created);

        return created;
    }
}
