package com.example.jitu.repository;

import com.example.jitu.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    @Query("select  a from  User a where a.username =?1 and a.password =?2")
    User findByUsernameAndPassword(String username, String password);
}
