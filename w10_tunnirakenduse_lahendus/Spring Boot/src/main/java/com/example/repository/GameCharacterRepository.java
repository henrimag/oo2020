package com.example.repository;

import com.example.demo.model.GameCharacter;

import java.util.ArrayList;
import java.util.List;

public class GameCharacterRepository {
    static List<GameCharacter> characters = new ArrayList<>();

    public static List<GameCharacter> buildCharacters(){
        characters = List.of(
            new GameCharacter("Mati",'M', "metslane"),
            new GameCharacter("Sandra",'N', "ninja"),
            new GameCharacter("Vallo",'N', "maag")
            );
            
            return characters;
    }
}