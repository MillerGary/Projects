/*
 * Class used to create a deck object and define cards within it
*/

public class Deck {
    //initialize global variables
    private Card cards[];
    private int size = 52;
    private int cardsDrawn;

    //Constructor
    Deck() {
        this.cards = new Card[size];
        this.cardsDrawn = 0;

        //variable to assign card's index in deck array
        int index = 0;
        //give cards in deck suits and ranks
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= 13; j++) {
                Card card = new Card(i, j);
                this.cards[index] = card;
                index++;
            } //inner for, gives rank
        } //outer for, gives suit
    } //Constructor- Deck

    public void printCards() {
        //for loop to print cards in deck
        for (int i = 0; i < size-cardsDrawn; i++) {
            System.out.println(cards[i].getRank() +" of "+ cards[i].getSuitName());
        } //for printing cards
    } //printCards

    //prints only the rank of the cards
    //used for Blackjack where suit does not matter
    public void printCardsByRank() {
        //for loop to print cards in deck
        for (int i = 0; i < size-cardsDrawn; i++) {
            System.out.println(cards[i].getRank());
        } //for printing cards by rank
    } //printCardsByRank

    public void shuffleCards() {
        //for loop used to give card objects a random index
        for (int i = 0; i < size; i++) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = temp;
        } //for suffling the deck
        //all cards are returned to the deck
        cardsDrawn = 0;
    } //shuffleCards

    //returns the number of cards remaining in the deck
    public int cardsLeft() {
        return size-cardsDrawn;
    } //cardsLeft

    //draws a card from the deck
    public Card draw() {
        if (cardsLeft() == 0) {
            shuffleCards();
        } //if deck is empty, return all cards to deck and shuffle
        //increment the number of cards drawn by 1
        cardsDrawn++;
        //return the card on top of the deck
        return cards[cardsDrawn-1];
    } //draw

    //draws a card from the deck with respect to rank
    //used for a game like Blackjack where suit does not matter
    public int drawRank() {
        if (cardsLeft() == 0) {
            shuffleCards();
        } //if deck is empty, return all cards and shuffle
        //increment the number of cards drawn by 1
        cardsDrawn++;
        //return the rank of the card on top of the deck
        return cards[cardsDrawn-1].getRank();
    } //drawRank
} //class- Deck
