package com.kku.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kku.second.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	User findByuserEmail(String email);


}
