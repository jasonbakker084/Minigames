/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novi.minigames;

/**
 *
 * @author jasonbakker
 */
public class Player {   
    
    private String name;
    private char pawn;
    private int score;

    public char getPawn() {
        return pawn;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Player(String name, char pawn) {

        this.name = name;
        this.pawn = pawn;
        this.score = 0;
    }

//     public void Win() {
//     System.out.println(this.name + " has won!");
//     this.score++;
//     }

    public void addScore() {
        score++;
    }

}
