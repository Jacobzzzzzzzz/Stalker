package com.example.stalker.model.dto.request;

import lombok.Builder;
import lombok.Data;

/*
 * @author SteklotaraBlizz
 *
 * Request form of user to vk
 *
 */
@Builder
@Data
public class UserRequest {
    private long id;
    private String username;
    private String fio;
    private String password;
}
