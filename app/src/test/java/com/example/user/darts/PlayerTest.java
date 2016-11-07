package com.example.user.darts;
import org.junit.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;
    Player player6;
    Player player7;
    Player player8;
    Player player9;
    Player player10;

    @Before
    public void beforeEach() {
        player1 = new Player("Michael van Gerwen", "Mighty Mike");
        player2 = new Player("Gary Anderson", "The Flying Scotsman");
        player3 = new Player("Phil Taylor", "The Power");
        player4 = new Player("Adrian Lewis", "Jackpot");
        player5 = new Player("Peter Wright", "Snakebite");
        player6 = new Player("James Wade", "The Machine");
        player7 = new Player("Robert Thornton", "The Thorn");
        player8 = new Player("Michael Smith", "Bully Boy");
        player9 = new Player("Dave Chisnall", "Chizzy");
        player10 = new Player("Raymond van Barneveld", "Barney");

        }

    @Test
    public void canGetName() {
        assertEquals("Michael van Gerwen", player1.getName());
    }

    @Test
    public void canGetNickname() {
        assertEquals("The Flying Scotsman", player2.getNickname());
    }

    @Test
    public void canSetCurrentRanking() {
        player1.setCurrentRanking(1);
        assertEquals(1, player1.getCurrentRanking());
    }
}
