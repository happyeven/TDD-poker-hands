package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Author ZHUDO2
 * @Date 8/26/2020 1:31 PM
 * @Version 1.0
 */
public class PokerHandsTest {

    @Test
    void should_return_player1_win_when_compare_cards_given_5D8C9SJSAC_and_2C5C7D8SQH() {
        //given
        String[] player1Cards = {"5D", "8C", "9S", "JS", "AC"};
        String[] player2Cards = {"2C", "5C", "7D", "8S", "QH"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player2_win_when_compare_cards_given_2C5C7D8SQH_and_5D8C9SJSAC() {
        //given
        String[] player2Cards = {"5D", "8C", "9S", "JS", "AC"};
        String[] player1Cards = {"2C", "5C", "7D", "8S", "QH"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player2 win", result);
    }

    @Test
    void should_return_tie_when_compare_cards_given_5D8C9SJSAC_and_5D8C9SJSAC() {
        //given
        String[] player1Cards = {"5D", "8C", "9S", "JS", "AC"};
        String[] player2Cards = {"5C", "8D", "9H", "JC", "AD"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("Tie", result);
    }

    @Test
    void should_return_player2_win_when_compare_cards_given_5D8C9SJSAC_and_5C8D9HQSAC() {
        //given
        String[] player1Cards = {"5D", "8C", "9S", "JS", "AC"};
        String[] player2Cards = {"5C", "8D", "9H", "QS", "AD"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player2 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_2C5C7D8SQH_and_2D6D6S8HQC() {
        //given
        String[] player1Cards = {"2D", "6D", "6S", "8H", "QC"};
        String[] player2Cards = {"2C", "5C", "7D", "8S", "QH"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player2_win_when_compare_cards_given_2C7C7D8SQH_and_2D6D6S8HQC() {
        //given
        String[] player1Cards = {"2D", "6D", "6S", "8H", "QC"};
        String[] player2Cards = {"2C", "7C", "7D", "8S", "QH"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player2 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_2H2D5S5C1D_and_1H3S4H5H6S() {
        //given
        String[] player1Cards = {"2H", "2D", "5S", "5C", "1D"};
        String[] player2Cards = {"1H", "3S", "4H", "5H", "6S"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_2H2D5S5C1D_and_1H1S4H4S6S() {
        //given
        String[] player1Cards = {"2H", "2D", "5S", "5C", "1D"};
        String[] player2Cards = {"1H", "1S", "4H", "4H", "6S"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_2H2D5S2C1D_and_2C5C7D8SQH() {
        //given
        String[] player1Cards = {"2H", "2D", "5S", "2C", "1D"};
        String[] player2Cards = {"2C", "5C", "7D", "8S", "QH"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_2H2D5S2C1D_and_2D6D6S8HQC() {
        //given
        String[] player1Cards = {"2H", "2D", "5S", "2C", "1D"};
        String[] player2Cards = {"2D", "6D", "6S", "8H", "QC"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_2H2D5S2C1D_and_6C6D6S8HQC() {
        //given
        String[] player1Cards = {"2H", "2D", "5S", "2C", "1D"};
        String[] player2Cards = {"6C", "6D", "6S", "8H", "QC"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player2 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_3H4D5S6C7D_and_6C6D6S8HQC() {
        //given
        String[] player1Cards = {"3H", "4D", "5S", "6C", "7D"};
        String[] player2Cards = {"6C", "6D", "6S", "8H", "QC"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_2H3H5H9HKH_and_3H4D5S6C7D() {
        //given
        String[] player1Cards = {"2H", "3H", "5H", "9H", "KH"};
        String[] player2Cards = {"3H", "4D", "5S", "6C", "7D"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player2_win_when_compare_cards_given_3H3D5S5C7D_and_6C6D6S8HQC() {
        //given
        String[] player1Cards = {"3H", "3D", "5S", "5C", "7D"};
        String[] player2Cards = {"6C", "6D", "6S", "8H", "QC"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player2 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_6H6D5S5C7D_and_6C6D3S3HQC() {
        //given
        String[] player1Cards = {"6H", "6S", "3S", "3H", "7D"};
        String[] player2Cards = {"6C", "6D", "5S", "5C", "QC"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player2 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_3H4D5S6C7D_and_6C7D8S9H10C() {
        //given
        String[] player1Cards = {"3H", "4S", "5S", "6H", "7D"};
        String[] player2Cards = {"6C", "7D", "8S", "9C", "10C"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player2 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_flush_and_straight() {
        //given
        String[] player1Cards = {"3S", "4S", "5S", "6S", "7S"};
        String[] player2Cards = {"6C", "7D", "8S", "9C", "10C"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player2_win_when_compare_cards_given_flush_max_cars_is_A_and_flush_max_cars_is_Q() {
        //given
        String[] player1Cards = {"3S", "4S", "5S", "6S", "AS"};
        String[] player2Cards = {"6C", "7C", "8C", "9C", "QC"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_3H3D5S5C3S_and_2H4H5H9HKH() {
        //given
        String[] player1Cards = {"3H", "3D", "5S", "5C", "3S"};
        String[] player2Cards = {"2H", "4H", "5H", "9H", "KH"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_4H4D5D5C4S_and_3H3D5S9C3S() {
        //given
        String[] player1Cards = {"4H", "4D", "5D", "5C", "4S"};
        String[] player2Cards = {"3H", "3D", "5S", "9C", "3S"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_four_of_kind_and_full_house() {
        //given
        String[] player1Cards = {"4H", "4D", "4C", "6C", "4S"};
        String[] player2Cards = {"3H", "3D", "5S", "5C", "3S"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player1_win_when_compare_cards_given_four_of_A_and_four_of_J() {
        //given
        String[] player1Cards = {"AH", "AD", "AC", "AC", "4S"};
        String[] player2Cards = {"JH", "JD", "JS", "JC", "3S"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player1 win", result);
    }

    @Test
    void should_return_player2_win_when_compare_cards_given_four_of_A_and_straight_flush() {
        //given
        String[] player1Cards = {"AH", "AD", "AC", "AC", "4S"};
        String[] player2Cards = {"3S", "4S", "5S", "6S", "7S"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player2 win", result);
    }
    @Test
    void should_return_player2_win_when_compare_cards_given_straight_flush_end_with_6_and_straight_flush_end_with_7() {
        //given
        String[] player1Cards = {"6H", "2H", "3H", "4H", "5H"};
        String[] player2Cards = {"3S", "4S", "5S", "6S", "7S"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("player2 win", result);
    }
    @Test
    void should_return_Tie_when_compare_cards_given_straight_flush_end_with_6_and_straight_flush_end_with_6() {
        //given
        String[] player1Cards = {"6H", "2H", "3H", "4H", "5H"};
        String[] player2Cards = {"3S", "4S", "5S", "6S", "2S"};
        PokerHands pokerHands = new PokerHands();
        //when
        String result = pokerHands.play(player1Cards, player2Cards);
        //then
        Assertions.assertEquals("Tie", result);
    }
}
