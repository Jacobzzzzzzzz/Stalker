package com.example.stalker.repos;

import com.example.stalker.model.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @author SteklotaraBlizz
 *
 * Repository to contain user's hobbies
 *
 */
@Repository
public interface HobbyRepo extends JpaRepository<Hobby, Long> {
}
