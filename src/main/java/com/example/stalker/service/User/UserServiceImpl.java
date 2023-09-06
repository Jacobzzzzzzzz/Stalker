package com.example.stalker.service.User;

import com.example.stalker.model.entity.User;
import com.example.stalker.service.User.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vk.api.sdk.actions.Account;
import com.vk.api.sdk.actions.Users;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.users.responses.GetResponse;
import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static org.hibernate.boot.model.process.spi.MetadataBuildingProcess.build;

/**
 * @author SteklotaraBlizz
 *
 * Implementations of app's business logics UserService
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final static String accessToken = "12345";
    private final String defaultUrl = "https://api.vk/method";

    private <T> T request(String url, Class<T> clazz) throws JsonProcessingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        RestTemplate restTemplate = new RestTemplate();

        return mapper.readValue(restTemplate.getForObject(url, String.class), clazz);
    }

    @Override
    public User getById(String id) { return null; }

    @Override
    public User getUser(){
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
