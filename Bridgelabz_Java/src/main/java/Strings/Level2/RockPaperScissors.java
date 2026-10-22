/*
Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
Hint =>
The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
Create a Method to find the Computer Choice using the Math.random
Create a Method to find the winner between the user and the computer
Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
Create a Method to display the results of every game and also display the average and percentage wins
In the main take user input for the number of games and call methods to display results
 */
package Strings.Level2;

import java.util.Scanner;

public class RockPaperScissors {

    // Method 1: Generate the computer's choice randomly
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    // Method 2: Find the winner of each game
    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        }

        if (player.equals("Rock") && computer.equals("Scissors")
                || player.equals("Paper") && computer.equals("Rock")
                || player.equals("Scissors") && computer.equals("Paper")) {
            return "Player";
        }

        return "Computer";
    }

    // Method 3: Calculate wins and winning percentages
    public static String[][] calculateStats(String[][] games, int totalGames) {
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 0; i < totalGames; i++) {
            if (games[i][2].equals("Player")) {
                playerWins++;
            } else if (games[i][2].equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }

        double playerPercentage = (playerWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;

        String[][] stats = new String[3][2];

        stats[0][0] = "Player Wins";
        stats[0][1] = String.valueOf(playerWins);

        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);

        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);

        return stats;
    }

    // Method 4: Display game results and statistics
    public static void displayResults(String[][] games, int totalGames) {
        System.out.printf("%-10s %-15s %-15s %-15s%n",
                "Game", "Player Choice", "Computer Choice", "Winner");

        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < totalGames; i++) {
            System.out.printf("%-10d %-15s %-15s %-15s%n",
                    i + 1, games[i][0], games[i][1], games[i][2]);
        }

        String[][] stats = calculateStats(games, totalGames);

        int playerWins = Integer.parseInt(stats[0][1]);
        int computerWins = Integer.parseInt(stats[1][1]);
        int draws = Integer.parseInt(stats[2][1]);

        double playerPercentage = playerWins * 100.0 / totalGames;
        double computerPercentage = computerWins * 100.0 / totalGames;

        System.out.println("\nOverall Statistics");
        System.out.println("-----------------------------------");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);
        System.out.printf("Player Winning Percentage: %.2f%%%n", playerPercentage);
        System.out.printf("Computer Winning Percentage: %.2f%%%n", computerPercentage);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of games: ");
        int totalGames = sc.nextInt();

        if (totalGames <= 0) {
            System.out.println("Number of games must be positive.");
            sc.close();
            return;
        }

        String[][] games = new String[totalGames][3];

        // Play multiple games
        for (int i = 0; i < totalGames; i++) {
            System.out.println("\nGame " + (i + 1));
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");

            String playerChoice = sc.next();

            // Validate and normalize the player's choice
            if (playerChoice.equalsIgnoreCase("Rock")) {
                playerChoice = "Rock";
            } else if (playerChoice.equalsIgnoreCase("Paper")) {
                playerChoice = "Paper";
            } else if (playerChoice.equalsIgnoreCase("Scissors")) {
                playerChoice = "Scissors";
            } else {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                i--;
                continue;
            }

            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            games[i][0] = playerChoice;
            games[i][1] = computerChoice;
            games[i][2] = winner;

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + winner);
        }

        // Display all game results and winning percentages
        displayResults(games, totalGames);

        sc.close();
    }
}
