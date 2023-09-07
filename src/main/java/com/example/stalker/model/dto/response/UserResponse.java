package com.example.stalker.model.dto.response;

import com.example.stalker.model.entity.Hobby;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author SteklotaraBlizz
 *
 * Data transfer object suitable to user from vk
 *
 */

@Data
@Builder
public class UserResponse {

    private Long id;
    private String fio;
    private List<Hobby> userHobby;

    //etc. (work in progress)
}
