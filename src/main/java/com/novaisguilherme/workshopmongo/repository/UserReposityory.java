package com.novaisguilherme.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.novaisguilherme.workshopmongo.domain.User;

@Repository
public interface UserReposityory extends MongoRepository<User, String> {

}
