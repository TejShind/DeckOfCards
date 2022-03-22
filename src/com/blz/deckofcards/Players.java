package com.blz.deckofcards;
import java.util.Scanner;
public class Players {

    public static void players() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number of players Maximum 4 ,Minimum 2, ");
        int player = sc.nextInt();
        if (player >= 2 && player <= 4) {
            System.out.println(player + " players will  play the game");
        } else {
            System.out.println("Please enter number of players in the Range");
        }
     }
  }
