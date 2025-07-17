package com.example.demo.controller;

import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import java.util.*;

@Controller
@AllArgsConstructor
public class PlayerController {
    //
    private final PlayerService playerService;
    //

    //public List<Player>
    @MutationMapping
    public Player create(@Argument Player player) {
        return null;
    }
}
