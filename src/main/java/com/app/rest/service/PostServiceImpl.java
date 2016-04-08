package com.app.rest.service;

import com.app.rest.entiry.Post;
import com.app.rest.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;

@Service
@Transactional
public class PostServiceImpl extends GenericServiceImpl<Post, Long> implements PostService {

    @Autowired
    private PostRepository postRepository;

}