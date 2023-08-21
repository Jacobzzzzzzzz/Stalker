package com.example.stalker.model.dto.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VkUserReuest {
    private long id;
    private String username;
    private String fio;
    private String password;
}
