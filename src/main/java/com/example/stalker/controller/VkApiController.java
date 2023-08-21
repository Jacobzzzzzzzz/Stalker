package com.example.stalker.controller;

import com.example.stalker.model.dto.response.VkUserDto;
import com.example.stalker.service.VkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class VkApiController {

    private final VkService vkService;

    @GetMapping
    public ResponseEntity<List<VkUserDto>> getAllUsers() {
        return ResponseEntity.ok(vkService.getAll());
    }

    //todo
}
