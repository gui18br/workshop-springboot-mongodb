package com.novaisguilherme.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.novaisguilherme.workshopmongo.domain.Post;

@Repository
public interface PostReposityory extends MongoRepository<Post, String> {

}
