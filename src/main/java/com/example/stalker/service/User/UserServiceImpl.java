package com.example.stalker.service.User;

import com.example.stalker.model.dto.response.UserResponse;
import com.example.stalker.model.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vk.api.sdk.actions.Account;
import com.vk.api.sdk.actions.Users;
import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

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
    private final String vkApiVers = "5.131";

    private <T> T request(String url, Class<T> clazz) throws JsonProcessingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        RestTemplate restTemplate = new RestTemplate();

        return mapper.readValue(restTemplate.getForObject(url, String.class), clazz);
    }

    private String request(String url){
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url,String.class);
    }

    @Override
    public User getById(String id) { return null; }

    @Override
    public User getUserInfo(String username) throws IOException {
        String usrUrl = defaultUrl + "/users.get?user_ids=" +
                        username + "fields=city,sex&access_token=" +
                        accessToken + "&v=" + vkApiVers;

        return request(usrUrl, User.class);
    }

    @Override
    public List<Long> getSubscriptionsByUser(User user) throws IOException {
        String subscrUrl = defaultUrl + "/users.getSubscriptions?user_id=" +
                user.getId().toString() + "&access_token=" +
                accessToken + "&v=" + vkApiVers;

        return Collections.singletonList(request(subscrUrl, Long.class));
    }

    @Override
    public void save() {

    }

    private UserResponse transform(User user){
        return UserResponse.builder()
                .id(user.getId())
                .fio(user.getName())
                .userHobby(user.getSubscriptions())
                .build();
    }
}
