package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projet.entities.User;



public interface UserRepository extends JpaRepository<User, Integer>{
	User findByEmail(String email);
	
   @Query("SELECT u FROM User u WHERE u.username=:username AND u.password=:password" )
	User findByUsernameAndPassword(String username, String password);
}
