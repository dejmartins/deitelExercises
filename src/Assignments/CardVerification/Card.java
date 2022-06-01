package Assignments.CardVerification;

public enum Card {
    VISA(4),
    MASTERCARD(5),
    AMERICAN_EXPRESS(37),
    DISCOVER(6);

    private final int prefix;
    Card(int prefix) {
        this.prefix = prefix;
    }

    public int getPrefix(){
        return prefix;
    }
}
