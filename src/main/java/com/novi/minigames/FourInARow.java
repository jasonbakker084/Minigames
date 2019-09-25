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
public class FourInARow {
    
    public static Scanner INPUT = new Scanner(System.in);
    
    private Player player1;
    private Player player2;
    public Player currentPlayer;
    private boolean gameEnded1 = false;
    
    char[][] field = new char[6][6];
    int kolom;
    
    public FourInARow (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
         for (int rij = 0; rij < 6; rij++) {
            for (int kolom = 0; kolom < 6; kolom++) {
                field[rij][kolom] = (char) ('.');
             }
         }
    }
    
    public void printBoard(){
         
        for (int i = 0; i < field.length; i++) {
            for (int x = 0; x < field.length; x++) {
                System.out.print(" | " + field[i][x]);
            }
            System.out.println(" | ");
            
        }
       
        System.out.println("--------------------------" +"\n"+ " | 1 | 2 | 3 | 4 | 5 | 6 |");
    }
    
    public void setField(int number, char pawn) {         
        
        boolean fillLoop = true;
        int counterFilled = 0;
        while(fillLoop == true){
            if(counterFilled == 6){
                break;
            }
            if(field[5-counterFilled][(number - 1)] == '.'){ 
                field[5-counterFilled][(number - 1)] = pawn;
                fillLoop = false;
            } else {
                counterFilled++;
            }
        }     
    }
    
    public void play() {
        
        while (!gameEnded1) {
            
            System.out.println("Current player: " + this.currentPlayer.getName() + "!");
        
          // input number in field
        // Use: Dots and/or numbers for fields
        System.out.println("Input a number: ");
        int number = INPUT.nextInt();

          if (number < 1 || number > 7) {
             System.out.println("There is no column at position " + (number + 1));
          }
      
        setField(number, currentPlayer.getPawn());
        printBoard();
         // change player after input
//        changePlayer1 = !changePlayer1;  
       
        
        if (currentPlayer == player1) {
            currentPlayer = player2;
            
        } else {
            currentPlayer = player1;
        }
        
//        if (field.checkWinHorizontal() || field.checkWinVertical()) {
//                System.out.println("Player " + this.currentPlayer + " has won!");
//                break;
        
        
        }
         if (gameEnded1 = true) {         
        System.out.println("The game has ended!");        
    }
    }
        
        // ######## WIN CONDITIONS ##############
        
        // Check for vertical win
public boolean checkWinVertical() {
            return verticalWin(6, kolom);
    }

// Check for horizontal win
public boolean checkWinHorizontal() {
    return horizontalWin(6,kolom);
}

// Conditions for vertical win
private boolean verticalWin(int rij, int kolom) {
    char charToCheck = field[rij][kolom];
    if (field[rij-1][kolom] == charToCheck &&
        field[rij-2][kolom] == charToCheck &&
        field[rij-3][kolom] == charToCheck) {
        return true;
    }

    return false;
    }

// Conditions for horizontal win
private boolean horizontalWin(int rij, int kolom) {
    char charToCheck = field[rij][kolom];
    if (field[rij][kolom+1] == charToCheck &&
            field[rij][kolom+2] == charToCheck &&
            field[rij][kolom+3] == charToCheck) {
        return true;
    }
    return false;
}
}
        
    



