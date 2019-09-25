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
public class Tictac2 {
    
    public static Scanner INPUT = new Scanner(System.in);
    
    private Player player1;
    private Player player2;
    public Player currentPlayer;
    private boolean gameEnded = false;
    
    char[][] grid = new char[3][3];

    
    public Tictac2 (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
         for (int rij = 0; rij < 3; rij++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                grid[rij][kolom] = (char) ('1' + kolom + rij * 3);
             }
         }
    }
    public void printBoard(){
         
        for (int i = 0; i < grid.length; i++) {
            for (int x = 0; x < grid.length; x++) {
                System.out.print(" | " + grid[i][x]);
            }
            System.out.println(" | ");
        }
    }
    
    public void setField(int number, char pawn) {
         grid[(number - 1) / 3][(number - 1) % 3] = pawn;
        
    }
    
     public void play() {


    while (!gameEnded) {
         
//        boolean changePlayer = true;
        System.out.println("Current player: " + this.currentPlayer.getName() + "!");
    
        // input number in field
        // Use: Dots and/or numbers for fields
        System.out.println("Input a number: ");
        int number = INPUT.nextInt();
        var rij = (number - 1) / 3;
        var kolom = (number - 1) % 3;       
      
       
       setField(number, currentPlayer.getPawn());
      
        printBoard();
        
        // change player after input
//        changePlayer = !changePlayer;  
        if (currentPlayer == player1) {
            currentPlayer = player2;
            
        } else {
            currentPlayer = player1;
        }
        
                 //loops through rows checking if win-condition exists
    for (int r = 0; r < 3; r++) {
        if (grid[rij][0] == grid[rij][1] && grid[rij][1] == grid[rij][2] && grid[rij][0] != '-')
           gameEnded = true;
           
        }
    //loops through columns checking if win-condition exists
    for (int c = 0; c < 3; c++) {
        if (grid[0][kolom] == grid[1][kolom] && grid[1][kolom] == grid[2][kolom] && grid[0][kolom] != '-' ) 
           gameEnded = true;           
        }
    //checks diagonals for win-condition
    if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != '-')
        gameEnded = true;
        

    if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != '-')
     gameEnded = true;
     
    
    // currentPlayer = currentPlayer == player1 ? player2 : player1;
        
    
    }
    
     if (gameEnded = true) {         
        System.out.println("The game  has ended!");        
    }
     
        System.out.println();
     
      for (int i = 0; i < grid.length; i++) {
            for (int x = 0; x < grid.length; x++) {
                System.out.print(" | " + grid[i][x]);
            }
            System.out.println(" | ");
        }
      
       if (currentPlayer == player2){
            System.out.println(player1.getName() + " has won!");
            this.player1.addScore();
            System.out.println("Total score " + player1.getName() + ":" + " " + player1.getScore());
            System.out.println("Total score " + player2.getName() + ":" + " " + player2.getScore());
            
        } else {
            System.out.println(player2.getName() + " has won!");
            this.player2.addScore();
            System.out.println("Total score " + player2.getName() + ":" + " " + player2.getScore());
            System.out.println("Total score " + player1.getName() + ":" + " " + player1.getScore());
            }    
     }
}
