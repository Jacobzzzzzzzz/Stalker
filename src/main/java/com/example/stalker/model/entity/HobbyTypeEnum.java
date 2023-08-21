package com.example.stalker.model.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum HobbyTypeEnum
{
    MUSIC("ROCK", "POP", "RAP", "METAL", "FOLK", "INDI", "CLASSICAL"),
    SPORT("GYM", "FOOTBALL", "BASKETBALL", "CYCLE", "MOTORSPORT", "HOKKEY", "SKII", "VOLLEYBALL");

    //Я хз почему, но идея даже с RequiredArgsConstructor ругается на отсутствие конструктора
    HobbyTypeEnum(String rock, String pop, String rap, String metal, String folk, String indi, String classical) {}

    HobbyTypeEnum(String gym, String football, String basketball, String cycle, String motorsport, String hokkey, String skii, String volleyball) {
    }
}
