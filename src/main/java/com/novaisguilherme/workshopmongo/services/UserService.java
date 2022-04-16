package com.novaisguilherme.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novaisguilherme.workshopmongo.domain.User;
import com.novaisguilherme.workshopmongo.repository.UserReposityory;

@Service
public class UserService {

	@Autowired
	private UserReposityory repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
