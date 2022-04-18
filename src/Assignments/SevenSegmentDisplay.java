package Assignments;

import java.util.Arrays;

public class SevenSegmentDisplay {
    private int[][] led = new int[5][4];
    private String binaryDigit;

    public void setScreen(String binaryDigit) {
        if (binaryDigit.charAt(0) == '1') {
            for (int counter = 0; counter < 4; counter++) {
                led[0][counter] = 1;
            }
        }

        if (binaryDigit.charAt(1) == '1') {
            for (int counter = 0; counter < 3; counter++) {
                led[counter][3] = 1;
            }
        }

        if (binaryDigit.charAt(2) == '1') {
            for (int counter = 2; counter < 5; counter++) {
                led[counter][3] = 1;
            }
        }

        if (binaryDigit.charAt(3) == '1') {
            for (int counter = 0; counter < 4; counter++) {
                led[4][counter] = 1;
            }
        }

        if (binaryDigit.charAt(4) == '1') {
            for (int counter = 2; counter < 5; counter++) {
                led[counter][0] = 1;
            }
        }

        if (binaryDigit.charAt(5) == '1') {
            for (int counter = 0; counter < 3; counter++) {
                led[counter][0] = 1;
            }
        }

        if (binaryDigit.charAt(6) == '1') {
            for (int counter = 0; counter < 4; counter++) {
                led[2][counter] = 1;
            }
        }

        this.binaryDigit = binaryDigit;
    }


    public void display() {
        int binary = Integer.parseInt(binaryDigit);
        if(binary < 11111112) {
            if (binaryDigit.length() < 9) {
                if (binaryDigit.charAt(7) == '1') {
                    for (int counter = 0; counter < led.length; counter++) {
                        for (int index = 0; index < led[counter].length; index++) {
                            if (led[counter][index] == 1)
                                System.out.printf("%c ", '#');
                            else System.out.printf("%c ", ' ');
                        }
                        System.out.println();
                    }
                } else {
                    for (int counter = 0; counter < led.length; counter++) {
                        for (int index = 0; index < led[counter].length; index++) {
                            if (led[counter][index] == 1)
                                System.out.printf("%c ", ' ');
                            else System.out.printf("%c ", ' ');
                        }
                        System.out.println();
                    }
                }

            } else System.out.println("Seven Segment Display requires only 8 digits!");
        } else System.out.println("Seven Segment Display requires only binary digits of 0s and 1s");

    }
}

