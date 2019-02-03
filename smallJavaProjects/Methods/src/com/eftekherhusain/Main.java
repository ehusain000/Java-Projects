package com.eftekherhusain;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Nabin", highScorePosition);

         highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ahmed", highScorePosition);

         highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Mubin", highScorePosition);

         highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Amanur", highScorePosition);

    }

    public static void displayHighScorePosition( String playerName, int playerposition){

        System.out.println( playerName + " managed to get into positon " + playerposition + " on the high score table");

    }

    public static int calculateHighScorePosition( int playerscore){

        if(playerscore >= 1000){

            return 1;

        }

        else if( playerscore >= 500 && playerscore <1000){

            return 2;
        }

        else if( playerscore >= 100 && playerscore < 500){

            return 3;
        }

        else {

            return 4;
        }
    }

}
