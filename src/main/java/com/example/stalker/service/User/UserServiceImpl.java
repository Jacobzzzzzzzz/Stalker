package com.example.stalker.service.User;

import com.example.stalker.model.entity.User;
import com.example.stalker.service.User.UserService;
import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;

/**
 * @author SteklotaraBlizz
 *
 * Implementations of app's business logics UserService
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    @Override
    public User getById(String id) {
        return null;
    }
}
