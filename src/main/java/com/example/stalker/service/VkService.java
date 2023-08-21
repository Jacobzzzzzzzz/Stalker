package com.example.stalker.service;

import com.example.stalker.model.dto.response.VkUserDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VkService {
    VkUserDto getById(Long id);
    VkUserDto getByUsername(String username);
    VkUserDto getByFio(String fio);
    List<VkUserDto> getAll();

    void Delete(Long id);
}
