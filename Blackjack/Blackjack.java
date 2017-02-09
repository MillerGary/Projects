/*
 * Gary Miller 2017
 * Program to simulate a simple hand of Blackjack
*/

//import necessary packages
import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        //create a Scanner to read user input
        Scanner scan = new Scanner(System.in);

        //create a new deck of cards
        Deck deck = new Deck();

        //shuffle the deck of cards
        deck.shuffleCards();

        //print current order of cards
        //deck.printCardsByRank();

        //draw two cards from the deck for the player's hand
        int playerCard1 = deck.draw().getRank();
        int playerCard2 = deck.draw().getRank();
        //create a new Player object for the player
        Player player = new Player(playerCard1, playerCard2);

        //draw two cards from the deck for the dealer's hand
        int dealerCard1 = deck.draw().getRank();
        int dealerCard2 = deck.draw().getRank();
        //create a new Player object for the dealer
        Player dealer = new Player(dealerCard1, dealerCard2);

        //return what players score is for initial hand
        System.out.println("Card 1 was: " +playerCard1+ ", and card 2 was: " +playerCard2);
        System.out.println("Player's score is: " +player.getScore());

        //State what the dealer's face up card is
        System.out.println("The dealer is showing: " +dealerCard1);

        //set the initial value for option to H
        String option = "H";

        //ask player what they would like to do
        System.out.println("What would you like to do?");
        System.out.println("Your options are to hit or stay");
        System.out.println("If you would like to hit, enter H, otherwise enter S");
        //scan user input
        option = scan.nextLine();
        //while loop for player to keep drawing cards
        //terminates when player decides to stay
        while(option.equals("H")) {
            int cardDrawn = hit(deck);
            player.addCard(cardDrawn);
            System.out.println("Card is a " +cardDrawn);
            System.out.println("Your score is now " +player.getScore());
            System.out.println("Hit or stay?");
            option = scan.nextLine();
        } //while player does not stay

        System.out.println("Your score is: " +player.getScore());
        System.out.println("The dealer's score is: " +dealer.getScore());

        //determine winner of hand
        if (player.getScore() > dealer.getScore()) {
            System.out.println("You Win!");
        } //player wins
        else {
            System.out.println("The dealers wins...better luck next time");
        } //else dealer wins

    } //main

    //used to add addition cards to a player's score
    public static int hit(Deck deck) {
        Deck drawDeck = deck;

        //draw a card from the deck
        int cardDrawn = drawDeck.draw().getRank();
        return cardDrawn;
    } //hit()
} //class- Blackjack
