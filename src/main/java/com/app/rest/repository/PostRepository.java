package com.app.rest.repository;

import com.app.rest.entiry.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
