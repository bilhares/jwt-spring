package com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.model.DAOUser;

public interface UserRepository extends JpaRepository<DAOUser, Long> {
	DAOUser findByUsername(String username);
}
