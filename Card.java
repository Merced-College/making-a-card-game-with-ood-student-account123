public class Card {

    //data variables should have 3
    private int value;
    private String suit;
    private String rank;

    //constructors have 2, default and the one that has 3 parameters
    public Card() {
        this.value = -1;
        this.suit = "no suit";
        this.rank = "no rank";
    }

    public Card(int value, String suit, String rank) {
        this.value = value;
        this.suit = suit;
        this.rank = rank;
    }

    //setters
    public void setValue(int value) {
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    //getters
    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    //toString or print
    public String toString() {
        return "card value: " + value + ", card suit: " + suit + ", card rank: " + rank;
    }
}
