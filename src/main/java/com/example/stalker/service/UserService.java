package com.example.stalker.service;

import com.example.stalker.model.dto.response.UserDto;

import com.example.stalker.model.entity.Hobby;
import com.example.stalker.model.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/*
 * @author SteklotaraBlizz
 *
 * Vk service to get smth from vk
 *
 */
@Component
public interface UserService {
    UserDto getById(Long id);
    UserDto getByUsername(String username);
    List<UserDto> getByFio(String fio);

    List<UserDto> getAll();
    List<Hobby> getUserHobby(UserDto user);
    void Delete(Long id);
}
