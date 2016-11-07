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
        player1 = new Player("Michael van Gerwen", "Mighty Mike", 1);
        player2 = new Player("Gary Anderson", "The Flying Scotsman", 2);
        player3 = new Player("Phil Taylor", "The Power", 3);
        player4 = new Player("Adrian Lewis", "Jackpot", 4);
        player5 = new Player("Peter Wright", "Snakebite", 5);
        player6 = new Player("James Wade", "The Machine", 6);
        player7 = new Player("Robert Thornton", "The Thorn", 7);
        player8 = new Player("Michael Smith", "Bully Boy", 8);
        player9 = new Player("Dave Chisnall", "Chizzy", 8);
        player10 = new Player("Raymond van Barneveld", "Barney", 10);

        }

    @Test
    public void canGetName() {
        assertEquals("Michael van Gerwen", player1.getName());
    }

    @Test
    public void canGetNickname() {
        assertEquals("The Flying Scotsman", player2.getNickname());
    }
}
