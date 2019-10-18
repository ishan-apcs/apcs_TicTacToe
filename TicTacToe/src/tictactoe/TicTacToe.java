/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author ishanmadan
 */
public class TicTacToe {

    public static String[][] grid = {
        {" ", " ", " "},
        {" ", " ", " "},
        {" ", " ", " "}};
    
    public static int victory = 0;
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String gameMode;
        
        System.out.println("Hello, and welcome to TicTacToe! Do you want to play against another player or the computer? Please reply"
                + " with \"player\" or \"computer\".");
        gameMode = input.nextLine().toLowerCase().replaceAll("[^playercomut]", "");
        while (!(gameMode.equals("player") || gameMode.equals("computer"))) {
            System.out.println("I'm sorry, that's not a valid option. Please reply with either \"player\" or \"computer\".");
            gameMode = input.nextLine().toLowerCase().replaceAll("[^playercomut]", "");
        }
        
        System.out.println("This is the grid:");
        printGrid();
        System.out.println("To play, enter your selections from the grid using letter/number combos (like A1, B2, and C3) when "
                + "prompted.");
        
        if (gameMode.equals("player")) {
            player();
        } else if (gameMode.equals("computer")) {
            
        } else {
            exit();
        }
    }
    
    public static void player() {
        System.out.println("Player 1, enter your selection.");
        
    }
    
    public static void printGrid() {
        System.out.println("  A   B   C\n" +
            "1 " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + "  \n" +
            " ---+---+---\n" +
            "2 " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + "  \n" +
            " ---+---+---\n" +
            "3 " + grid[1][0] + " | " + grid[2][1] + " | " + grid[2][2]);
        
    }
    
    public static void exit() {
        System.out.println("I'm sorry, but it appears that I can't code. My sincerest apologies. You will now be redirected to the "
                + "afterlife. Goodbye!");
        System.exit(0);
    }
    
}
