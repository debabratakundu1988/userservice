package com.spring_app.userservice.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;
import com.spring_app.userservice.model.User;

import java.util.List;

@Repository
public interface UserRepository extends CosmosRepository<User, String> {
//    List<User> findByName(String name);
}
