package ChapterFive;

public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        System.out.println("THE TWELVE DAYS OF CHRISTMAS \n");

        String day = null;
        String stanza = null;
        for(int counter = 1; counter <= 12; counter++){
            switch (counter){
                case 1:
                    day = "first";
                    break;
                case 2:
                    day = "second";
                    break;
                case 3:
                    day = "third";
                    break;
                case 4:
                    day = "fourth";
                    break;
                case 5:
                    day = "fifth";
                    break;
                case 6:
                    day = "sixth";
                    break;
                case 7:
                    day = "seventh";
                    break;
                case 8:
                    day = "eight";
                    break;
                case 9:
                    day = "night";
                    break;
                case 10:
                    day = "tenth";
                    break;
                case 11:
                    day = "eleventh";
                    break;
                default:
                    day = "twelvth";
                    }

            System.out.printf("On the %s day of christmas%nMy true love gave to me%n", day);

            switch (counter){
                case 1:
                    stanza = "A partridge in a pear tree.";
                    break;
                case 2:
                    stanza = "Two turtle doves,\n" +
                            "And a partridge in a pear tree.";
                    break;
                case 3:
                    stanza = "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.";
                    break;
                case 4:
                    stanza = "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves\n" +
                            "And a partridge in a pear tree.";
                    break;
                case 5:
                    stanza = "Five golden rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves\n" +
                            "And a partridge in a pear tree.";
                    break;
                case 6:
                    stanza = "Six geese a-laying,\n" +
                            "Five golden rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves\n" +
                            "And a partridge in a pear tree.";
                    break;
                case 7:
                    stanza = "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five golden rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves\n" +
                            "And a partridge in a pear tree.";
                    break;
                case 8 :
                    stanza = "Eight maids a-milking,\n" +
                            "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five golden rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves\n" +
                            "And a partridge in a pear tree.";
                    break;
                case 9:
                    stanza = "Nine ladies dancing,\n" +
                            "Eight maids a-milking,\n" +
                            "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five golden rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves\n" +
                            "And a partridge in a pear tree.";
                    break;
                case 10:
                    stanza = "Ten lords a-leaping,\n" +
                            "Nine ladies dancing,\n" +
                            "Eight maids a-milking,\n" +
                            "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five golden rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves\n" +
                            "And a partridge in a pear tree.";
                    break;
                case 11:
                    stanza = "Eleven pipers piping,\n" +
                            "Ten lords a-leaping,\n" +
                            "Nine ladies dancing,\n" +
                            "Eight maids a-milking,\n" +
                            "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five golden rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves\n" +
                            "And a partridge in a pear tree.";
                    break;
                default:
                    stanza = "Twelve drummers drumming,\n" +
                            "Eleven pipers piping,\n" +
                            "Ten lords a-leaping,\n" +
                            "Nine ladies dancing,\n" +
                            "Eight maids a-milking,\n" +
                            "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five golden rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves\n" +
                            "And a partridge in a pear tree.";

            }

                System.out.printf("%s%n%n", stanza);

            }
        }
    }

