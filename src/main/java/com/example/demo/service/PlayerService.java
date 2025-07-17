package com.example.demo.service;

import com.example.demo.model.Player;
import com.example.demo.model.Team;
import org.springframework.stereotype.Service;

import java.util.*;
//
import java.util.Optional;

@Service
public class PlayerService {
    List<Player> players = new ArrayList<>();
    //
    public List<Player> findAll() {
        List<Player> list = new ArrayList<>();
        //
        //
        //
        return list;
    }

    //
    public Optional<Player> findOne(int id) {
        return players.stream().filter(player -> player.getId() == id).findFirst();
    }
    //
    public Player create(String name,Team team){
        Player player = new Player();
    }
    //update
    public Player update(Integer id, String name, Team team ){
        Player updatedPlayer = new Player(id,name,team);
        Optional<Player> optinal = players.stream().filter(c -> c.getId() == id).findFirst();
        //
        return updatedPlayer;
    }
     //
    public Player delete(Integer id) {
        Player player = players.stream().filter(c -> c.getId() == id)
                .findFirst().orElseThrow(() -> new IllegalAccessException());
        return player;
    }
     //
}
