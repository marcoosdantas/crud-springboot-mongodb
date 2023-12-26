package com.marcosdantas.crudmongodb.services;

import com.marcosdantas.crudmongodb.domain.User;
import com.marcosdantas.crudmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
  @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();

    }
}
