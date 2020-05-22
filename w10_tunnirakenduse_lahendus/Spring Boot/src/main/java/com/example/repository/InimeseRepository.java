package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Inimene;

public class InimeseRepository {
    
    static List<Inimene> inimesed = new ArrayList<>();

    public static List<Inimene> buildInimesed(){
        inimesed = List.of(
            new Inimene("Vallo",'M', "Raamatupidaja"),
            new Inimene("Lembit",'M', "Kirurg"),
            new Inimene("Aili",'N', "Arhitekt"),
            new Inimene("Viktoria",'N', "Skulptor"),
            new Inimene("Juss",'M', "Korvpallur")
            );
            
            return inimesed;
    }
}
