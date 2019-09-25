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
public class SwitchPlayer {
    
    public Player player1;
    public Player player2;
    public Player currentPlayer;
    
    public SwitchPlayer(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = currentPlayer;
        
    public static SwitchPlayer(){
        if (currentPlayer == player1) {
            currentPlayer = player2;
            
        } else {
            currentPlayer = player1;
        }
    }    
        
}
