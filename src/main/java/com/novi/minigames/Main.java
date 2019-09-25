package com.novi.minigames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
    boolean debug = true;

    char player = 'X';

    System.out.println("****** Welcome to MiniGames! *******");
        System.out.println();
        
    // Get name of player 1
    System.out.println("Input name player1:");
    String player1Name = debug ? "Jason" : Game.s.next();
    /*if(debug) {
         player1Name = "Jason";
    } else {
         player1Name = Game.s.next();
    }*/

    // Get name of player 2
    System.out.println("Input name player2:");
    String player2Name = debug ? "Henk" : Game.s.next();

    
    // enter pawn
    System.out.println("Player's choose pawns.");

    System.out.print(player1Name + ": Choose X or O: ");
    char a = input.next().charAt(0);

    // create players
    System.out.println();

    // Game game = new TicTacToe(player1, player2);

    Player player1 = new Player(player1Name, a);
    Player player2 = new Player(player2Name, a == 'X' || a == 'x' ? 'O' : 'X');

    if (a == 'X' || a == 'x') {
        System.out.println(player1.getName() + " = " + player1.getPawn());
    } 
    
    else if (a == 'O' || a == 'o') {
        System.out.println(player1.getName() + " = " + player1.getPawn());
    }

    int player1Score = 0;
    int player2Score = 0;

    // Print Menu
    String game1 = "Tic Tac Toe";
    String game2 = "Four in a row";
    String game3 = "Exit";

    
    // Get chosen field
    
    boolean loopGame = true;
    
   while(loopGame){
       System.out.println("Choose game 1 or 2: \n" + "1: " + game1 + "\n" + "2: " + game2 + "\n" + "3: " + game3);
 
     
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You choose: " + game1);
                System.out.println("Welcome to Tic Tac Toe " + player1.getName() + " & " + player2.getName());
                Tictac2 TicTacToe =  new Tictac2(player1, player2);
                TicTacToe.printBoard();
                TicTacToe.play();

    //    Game game = new TicTacToe(player1, player2);

        // Start chosen game Tix Tac Toe
    System.out.println("");
    
    // Board
    break;
   
    // ############################## FOUR IN A ROW ########################################

    case 2:
    System.out.println("You choose: " + game2);

    // Start chosen game Tix Tac Toe
    System.out.println("Welcome to Four in a Row!! " + player1.getName() + " & " + player2.getName());
        System.out.println();
    
     FourInARow FourInAROW =  new FourInARow(player1, player2);
                FourInAROW.printBoard();
                FourInAROW.play();
        System.out.println();
        
    break;
    
    case 3:
    System.exit(0);
    break;
    }
      if(false) {
          System.exit(0);
   }
 
   
    
    // String currentPlayer = spelernaam

    // Change field to current player pawn (X or O)

    // If game is won
    // Print board
    // Winner gets a point
    // Print scores
    // Go back to menu

    // If game is not won
    // Switch players
    // Start next turn


    }
  }
}

    


