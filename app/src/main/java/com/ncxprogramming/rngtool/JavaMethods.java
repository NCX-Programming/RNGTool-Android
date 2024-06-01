package com.ncxprogramming.rngtool;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

public class JavaMethods {

    /**
     * {@summary Method that turns generates a random number from 1 to 26, then converts that to a
     * letter of the alphabet and returns the result as a string.}
     * @return String
     */
    public static String NumToLetter() {
        final int letterChooser = (int) ((Math.random() * 25) + 1);
        String marble = "";

        switch (letterChooser) {
            case 1:
                marble = "a";
                break;
            case 2:
                marble = "b";
                break;
            case 3:
                marble = "c";
                break;
            case 4:
                marble = "d";
                break;
            case 5:
                marble = "e";
                break;
            case 6:
                marble = "f";
                break;
            case 7:
                marble = "g";
                break;
            case 8:
                marble = "h";
                break;
            case 9:
                marble = "i";
                break;
            case 10:
                marble = "j";
                break;
            case 11:
                marble = "k";
                break;
            case 12:
                marble = "l";
                break;
            case 13:
                marble = "m";
                break;
            case 14:
                marble = "n";
                break;
            case 15:
                marble = "o";
                break;
            case 16:
                marble = "p";
                break;
            case 17:
                marble = "q";
                break;
            case 18:
                marble = "r";
                break;
            case 19:
                marble = "s";
                break;
            case 20:
                marble = "t";
                break;
            case 21:
                marble = "u";
                break;
            case 22:
                marble = "v";
                break;
            case 23:
                marble = "w";
                break;
            case 24:
                marble = "x";
                break;
            case 25:
                marble = "y";
                break;
            case 26:
                marble = "z";
                break;
            default:
                marble = Integer.toString(letterChooser);
                break;
        }

        marble = marble.toUpperCase();
        return marble;
    }

    /**
     * {@summary Method to translate randomised numbers from 1 to 13 into card values}
     * @param toInt How many cards to be displayed
     * @param cards Randomised Numbers
     * @param switchValues Settings to determine Ace Value and whether to show point values or not
     * @return String
     */
    @NonNull
    public static String CardString(
            int toInt,
            @NotNull List<Integer> cards,
            @NotNull Boolean[] switchValues) {

        final String[] sarray = new String[toInt];
        final boolean ab = switchValues[0];
        final boolean fb = switchValues[1];
        StringBuilder cs = new StringBuilder();

        for (int i = 0; i < toInt; i++) {
            sarray[i] = Integer.toString(cards.get(i));
        }

        for (int i = 0; i < sarray.length; i++) {
            if (!fb) {
                if (Objects.equals(sarray[i], "11")) {
                    sarray[i] = "J";
                } else if (Objects.equals(sarray[i], "12")) {
                    sarray[i] = "Q";
                } else if (Objects.equals(sarray[i], "13")) {
                    sarray[i] = "K";
                }
            } else if (fb) {
                if (Objects.equals(sarray[i], "11")) {
                    sarray[i] = "10";
                } else if (Objects.equals(sarray[i], "12")) {
                    sarray[i] = "10";
                } else if (Objects.equals(sarray[i], "13")) {
                    sarray[i] = "10";
                }
            }
            if (ab) {
                if (Objects.equals(sarray[i], "1")) {
                    if (fb) {
                        sarray[i] = "11";
                    } else if (!fb) {
                        sarray[i] = "A";
                    }
                }
            } else if (!ab) {
                if (Objects.equals(sarray[i], "1")) {
                    if (fb) {
                        sarray[i] = "1";
                    } else if (!fb) {
                        sarray[i] = "A";
                    }
                }
            }

            if (i < sarray.length - 1) {
                cs.append(sarray[i]).append(", ");
            } else {
                cs.append(sarray[i]);
            }
        }

        return cs.toString();
    }
}
