/*
 * Class that creates a card object
*/

public class Card {
    //initialize global variables
    private int suit;
    private int rank;

    //Constructor- Card
    public Card() {
        int suit = 0;
        int rank = 0;
    } //Constructor- Card

    //create a Card with a suit and rank
    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    } //card with suit and rank

    //returns the suit of a card in String format
    public String getSuitName() {
        String suitName;
        switch(suit) {
            case 1:
                suitName = "Clubs";
                break;
            case 2:
                suitName = "Diamonds";
                break;
            case 3:
                suitName = "Spades";
                break;
            case 4:
                suitName = "Hearts";
                break;
            default:
                suitName = "No suit assigned";
                break;
        } //determine the String format of suit
        return suitName;
    } //getSuitName

    //returns suit of card in int format
    public int getSuit() {
        return suit;
    } //getSuit

    //returns the rank of the card
    public int getRank() {
        return rank;
    } //getRank

    //return suit and rank of card
    public String getCard() {
        String value = getRank() +" of "+ getSuitName();
        return value;
    } //getCard

} //class- Card
