package com.example;

import com.example.entities.*;

public class RunDemoWithoutSpring {
    public static void main(String[] args) {
        Team redSox = new RedSox();
        Team cubs = new Cubs();
        Game game = new BaseballGame(redSox, cubs);
        System.out.println(game.playGame());
    }
}
