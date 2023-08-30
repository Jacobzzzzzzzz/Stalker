package com.example.stalker.service.impl;

import com.example.stalker.model.dto.response.UserDto;
import com.example.stalker.model.entity.Hobby;
import com.example.stalker.model.entity.User;
import com.example.stalker.model.repos.UserRepo;
import com.example.stalker.service.UserService;
import com.vk.api.sdk.actions.Account;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import lombok.RequiredArgsConstructor;
import org.jvnet.hk2.annotations.Service;

import java.util.List;

/**
 * @author SteklotaraBlizz
 *
 * Implementations of app's business logics UserService
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

}
