package com.example.stalker.service.User;

import com.example.stalker.model.entity.User;
import com.example.stalker.service.User.UserService;
import com.vk.api.sdk.actions.Account;
import com.vk.api.sdk.actions.Users;
import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;

import static org.hibernate.boot.model.process.spi.MetadataBuildingProcess.build;

/**
 * @author SteklotaraBlizz
 *
 * Implementations of app's business logics UserService
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private Account vkAccount;
    private Users vkUser;

    @Override
    public User getById(String id) {
        return null;
    }

    @Override
    public void save() {

    }

    private User transform(Users vkUser, Account vkAccount){
        //return User.builder()
          //      .id(vkUser.get())
            //    build();
        return null;
    }
}
