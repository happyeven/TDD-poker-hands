package com.example;

import java.util.Arrays;

public class PokerHands {

    private static final String PLAYER1_WIN = "player1 win";
    private static final String PLAYER2_WIN = "player2 win";
    private static final String TIE = "Tie";

    public String compare(String[] player1Cards, String[] player2Cards) {
        Integer[] player1CardsValue = changeStringToInteger(player1Cards);
        Integer[] player2CardsValue = changeStringToInteger(player2Cards);
        return compareThreeOfAKind(player1CardsValue, player2CardsValue);
    }

    private String compareSimpleCars(Integer[] player1CardsValue, Integer[] player2CardsValue) {
        Arrays.sort(player1CardsValue);
        Arrays.sort(player2CardsValue);
        for (int index = 0; index < player1CardsValue.length; index++) {
            if (player1CardsValue[index] > player2CardsValue[index]) {
                return PLAYER1_WIN;
            } else if (player1CardsValue[index] < player2CardsValue[index]) {
                return PLAYER2_WIN;
            }
        }
        return TIE;
    }

    private String comparePairCards(Integer[] player1CardsValue, Integer[] player2CardsValue) {
        Integer player1PairCardValue = getPairCardValue(player1CardsValue);
        Integer player2PairCardValue = getPairCardValue(player2CardsValue);
        if (player1PairCardValue == player2PairCardValue && player1PairCardValue == 0) {
            return compareSimpleCars(player1CardsValue, player2CardsValue);
        }
        return player1PairCardValue > player2PairCardValue ? PLAYER1_WIN : PLAYER2_WIN;
    }

    private String compareThreeOfAKind(Integer[] player1CardsValue, Integer[] player2CardsValue) {
        Integer player1HaveThreeOfAKind = isThreeOfAKind(player1CardsValue);
        Integer player2HaveThreeOfAKind = isThreeOfAKind(player2CardsValue);
        if (player1HaveThreeOfAKind > player2HaveThreeOfAKind) {
            return PLAYER1_WIN;
        } else if (player1HaveThreeOfAKind < player2HaveThreeOfAKind) {
            return PLAYER2_WIN;
        }
        return comparePairCards(player1CardsValue, player2CardsValue);
    }


    private Integer isThreeOfAKind(Integer[] playerCardsValue) {
        Arrays.sort(playerCardsValue);
        for (int index = 0; index < playerCardsValue.length - 2; index++) {
            if (playerCardsValue[index] == playerCardsValue[index + 1]
                    && playerCardsValue[index] == playerCardsValue[index + 2]) {
                return playerCardsValue[index];
            }
        }
        return 0;
    }

    private Integer[] changeStringToInteger(String[] playerCards) {
        Integer[] result = new Integer[5];
        for (int index = 0; index < playerCards.length; index++) {
            result[index] = getIntegerValue(Character.toString(playerCards[index].charAt(0)));
        }
        return result;
    }

    private Integer getIntegerValue(String value) {
        switch (value) {
            case "A":
                return 14;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            default:
                return Integer.parseInt(value);
        }
    }

    private Integer getPairCardValue(Integer[] playerCards) {
        Arrays.sort(playerCards);
        for (int index = 0; index < playerCards.length - 1; index++) {
            if (playerCards[index] == playerCards[index + 1]) {
                return playerCards[index];
            }
        }
        return 0;
    }
}
