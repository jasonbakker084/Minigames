/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.novi.minigames;

import java.util.Scanner;

/**
 *
 * @author jasonbakker
 */
public abstract class Game {

    public static Scanner s = new Scanner(System.in);

    public Player player1;
    public Player player2;
    public Player currentPlayer;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }

    public void SwitchPlayer() {
        this.currentPlayer = (this.currentPlayer == this.player1) ? this.player2 : this.player1;
    }
    
    public void PrintPlayers() {
    System.out.println(this.player1.toString());
    System.out.println(this.player2.toString());
  }
    
    public abstract void play();
    

    
}