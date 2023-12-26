package com.marcosdantas.crudmongodb.repository;

import com.marcosdantas.crudmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends MongoRepository<User, String> {

}