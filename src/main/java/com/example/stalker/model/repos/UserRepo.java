package com.example.stalker.model.repos;

import com.example.stalker.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
* @author SteklotaraBlizz
*
* Repository to contain users
*
 */

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
    Optional<User> findPasswordById(@Param("id") Long id);
}
