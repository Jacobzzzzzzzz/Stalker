package com.example.stalker.model.repos;

import com.example.stalker.model.entity.User;
import lombok.NoArgsConstructor;
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

}
