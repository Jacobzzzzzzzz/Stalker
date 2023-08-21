package com.example.stalker.service.impl;

import com.example.stalker.model.dto.response.UserDto;
import com.example.stalker.model.entity.Hobby;
import com.example.stalker.model.entity.User;
import com.example.stalker.model.repos.UserRepo;
import com.example.stalker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    @Override
    public UserDto getById(Long id) {
        List<User> tempUser = userRepo.findById(id).stream().toList();
        //return transform(tempUser.get());
        return null;
    }

    @Override
    public UserDto getByUsername(String username) {
        List<User> tempUser = userRepo.findByUsername(username).stream().toList();
        //return transform(tempUser.get());
        return null;
    }

    @Override
    public List<UserDto> getByFio(String fio) {
        List<User> tempUser = userRepo.findByFio(fio).stream().toList();

        /*List<UserDto> dtoList = tempUser.stream()
                .map(user -> transform(tempUser.get())
                .toList();*/
        return null;
    }

    @Override
    public List<UserDto> getAll() {
        List<User> tempUser = userRepo.findAll().stream().toList();

        /*List<UserDto> dtoList = tempUser.stream()
                .map(user -> transform(tempUser.get())
                .toList();*/
        return null;
    }

    @Override
    public List<Hobby> getUserHobby(UserDto user) {
        //Хз
        return user.getUserHobby();
    }

    @Override
    public void Delete(Long id) {
        if(!userRepo.existsById(id)){
            //throw new Exception(String.format("User not found via id"));
        }
        userRepo.deleteById(id);
    }

    private UserDto transform(User user) {
        return UserDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .fio(user.getName())
                //.userHobby()
                .build();
    }
}
