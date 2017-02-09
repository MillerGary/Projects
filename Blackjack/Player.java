/*
 * Class used create a player object and give it methods
*/

public class Player {
    //global variables
    private int card1;
    private int card2;
    private int score;
    //constructor- Player
    Player() {
        card1 = 0;
        card2 = 0;
        score = card1 + card2;
    } //constructor- Player

    Player(int firstCard, int secondCard) {
        card1 = firstCard;
        card2 = secondCard;
        if (card1 > 10) {
            card1 = 10;
        } //if face card, value is set to 10
        if (card2 > 10) {
            card2 = 10;
        } //if face card, value is set to 10
        score = card1 + card2;
    } //Player

    //get the score of Player's hand
    public int getScore() {
        return score;
    } //return current score of player's hand

    //add a new card to player's score
    public void addCard(int newCard) {
        int value = newCard;
        if (value > 10) {
            value = 10;
        } //if face card, value is set to 10
        score += value;
        //check if player score busts
        if (score > 21) {
            score = 0;
        } //if player busts
    } //addCard
} //class- Player
