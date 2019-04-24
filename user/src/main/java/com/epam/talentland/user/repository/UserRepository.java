package com.epam.talentland.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.talentland.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
