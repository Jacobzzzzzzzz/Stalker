package com.example.stalker.service.User;

import com.example.stalker.model.entity.User;
import org.springframework.stereotype.Component;

import java.io.IOException;
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

    public User getUserInfo(String username) throws IOException;

    public List<Long> getSubscriptionsByUser(User user) throws IOException;

    public void save();
}
