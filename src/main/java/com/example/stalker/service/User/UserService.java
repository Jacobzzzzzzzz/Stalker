package com.example.stalker.service.User;

import com.example.stalker.model.dto.response.UserDto;

import com.example.stalker.model.entity.Hobby;
import com.example.stalker.model.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author SteklotaraBlizz
 *
 * Vk service to get smth from vk
 *
 */
@Component
public interface UserService {
    public User getById(String id);
    public void save();
}
