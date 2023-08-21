package com.example.stalker.controller;

import com.example.stalker.model.dto.response.UserDto;
import com.example.stalker.model.entity.Hobby;
import com.example.stalker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
* @author SteklotaraBlizz
*
* Vk controller to check vk.api request status
*
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping
    public ResponseEntity<List<Hobby>> getUserHobbiesById(Long id){
        return ResponseEntity.ok(userService.getUserHobby(id));
    }

    //todo
}
