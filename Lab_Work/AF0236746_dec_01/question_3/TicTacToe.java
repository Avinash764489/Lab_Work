package question_3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//which has the options to play the game, view the 
//instructions, view a player’s win percentage, and exit.

public class TicTacToe {
	static Scanner sc = new Scanner(System.in);
	static String[] board;
    static String turn;
	static int player1 = 0;
	static int player2 = 0;
	static int tie = 0;
	
	public static String start_game() {
		        for (int a = 0; a < 8; a++) {
		            String line = null;
		 
		            switch (a) {
		            case 0:
		                line = board[0] + board[1] + board[2];
		                break;
		            case 1:
		                line = board[3] + board[4] + board[5];
		                break;
		            case 2:
		                line = board[6] + board[7] + board[8];
		                break;
		            case 3:
		                line = board[0] + board[3] + board[6];
		                break;
		            case 4:
		                line = board[1] + board[4] + board[7];
		                break;
		            case 5:
		                line = board[2] + board[5] + board[8];
		                break;
		            case 6:
		                line = board[0] + board[4] + board[8];
		                break;
		            case 7:
		                line = board[2] + board[4] + board[6];
		                break;
		            }
		            //For X winner
		            if (line.equals("XXX")) {
		                return "X";
		            }
		             
		            // For O winner
		            else if (line.equals("OOO")) {
		                return "O";
		            }
		        }
		         
		        for (int a = 0; a < 9; a++) {
		            if (Arrays.asList(board).contains(
		                    String.valueOf(a + 1))) {
		                break;
		            }
		            else if (a == 8) {
		                return "draw";
		            }
		        }
		 
		       // To enter the X Or O at the exact place on board.
		        System.out.println(
		            turn + "'s turn; enter a slot number to place "
		            + turn + " in:");
		        return null;
		    }
		     
		    // To print out the board.
		    /* |---|---|---|
		       | 1 | 2 | 3 |
		       |-----------|
		       | 4 | 5 | 6 |
		       |-----------|
		       | 7 | 8 | 9 |
		       |---|---|---|*/
		   
		    static void printBoard()
		    {
		        System.out.println("|---|---|---|");
		        System.out.println("| " + board[0] + " | "
		                           + board[1] + " | " + board[2]
		                           + " |");
		        System.out.println("|-----------|");
		        System.out.println("| " + board[3] + " | "
		                           + board[4] + " | " + board[5]
		                           + " |");
		        System.out.println("|-----------|");
		        System.out.println("| " + board[6] + " | "
		                           + board[7] + " | " + board[8]
		                           + " |");
		        System.out.println("|---|---|---|");
		    }
		 
		    public static void start()
		    {
		        Scanner in = new Scanner(System.in);
		        board = new String[9];
		        turn = "X";
		        String winner = null;
		 
		        for (int a = 0; a < 9; a++) {
		            board[a] = String.valueOf(a + 1);
		        }
		 
		        System.out.println("Welcome to 3x3 Tic Tac Toe.");
		        printBoard();
		 
		        System.out.println(
		            "X will play first. Enter a slot number to place X in:");
		 
		        while (winner == null) {
		            int numInput;
		           
		           // Exception handling.
		           // numInput will take input from user like from 1 to 9.
		           // If it is not in range from 1 to 9.
		           // then it will show you an error "Invalid input."
		            try {
		                numInput = in.nextInt();
		                if (!(numInput > 0 && numInput <= 9)) {
		                    System.out.println(
		                        "Invalid input; re-enter slot number:");
		                    continue;
		                }
		            }
		            catch (InputMismatchException e) {
		                System.out.println(
		                    "Invalid input; re-enter slot number:");
		                continue;
		            }
		             
		            // This game has two player x and O.
		            // Here is the logic to decide the turn.
		            if (board[numInput - 1].equals(
		                    String.valueOf(numInput))) {
		                board[numInput - 1] = turn;
		 
		                if (turn.equals("X")) {
		                    turn = "O";
		                }
		                else {
		                    turn = "X";
		                }
		 
		                printBoard();
		                winner = TicTacToe.start_game();
		            }
		            else {
		                System.out.println(
		                    "Slot already taken; re-enter slot number:");
		            }
		        }
		       
		        // If no one win or lose from both player x and O.
		        // then here is the logic to print "draw".
		        if (winner.equalsIgnoreCase("draw")) {
		            System.out.println(
		                "It's a draw! Thanks for playing.");
		            tie++;
		        }
		       
		        // For winner -to display Congratulations! message.
		        else {
		            
		            if(winner == "X") {
		            	System.out.println("Congratulations! player1 won! Thanks for playing.");
		            	player1++;
		            }
		            	
		            else {
		            	System.out.println("Congratulations! player2 won! Thanks for playing.");
		            	player2++;
		            }
		            	
		        }
		      
		    }
	
	public static void view_instruction() {
	System.out.println("1. The game is played on a grid that's 3 squares by 3 squares.");
	System.out.println("2. You are X, your friend is O. Players take turns putting their marks in empty squares.");
	System.out.println("3. The first player to get 3 of her marks in a row (up, down, across, or diagonally) is the winner.");
	System.out.println("4. When all 9 squares are full, the game is over.");
	}
	
	public static void result() {
		System.out.println("Player 1 wins :- "+player1);
		System.out.println("Player 2 wins :- "+player2);
		System.out.println("Tie :- "+tie);
	}

	public static void main(String arg[]) {
		
		int choice, ch;
		
		do {
		System.out.println("Enter your choice");
		System.out.println("1. Start play the game");
		System.out.println("2. View the instruction");
		System.out.println("3. View result");
		System.out.println("4. Exit");
		choice = sc.nextInt();
		
		TicTacToe obj = new TicTacToe();
		switch(choice) {
		
		case 1:{
			obj.start();
			break;
		}
		case 2:{
			obj.view_instruction();
			break;
		}
		case 3:{
			obj.result();
		}
		case 4:{
			System.exit(0);
			break;
		}
		default: System.out.println("Enter an valid choice");
		}
		System.out.println("Enter 1 if you want to continue");
		ch = sc.nextInt();
		}while(ch==1);
	
	}
}
