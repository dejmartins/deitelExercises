package ChapterSeven;

public class Card {
    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuit) {
        face = cardFace;
        suit = cardSuit;
    }

    public String toString() {
        return face + " of " + suit;
    }
}
