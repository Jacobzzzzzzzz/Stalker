package com.example.stalker.service.User;

import com.example.stalker.model.entity.User;
import com.vk.api.sdk.actions.Users;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
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
    public User getUser() throws ClientException, ApiException;
    public void save();
}
