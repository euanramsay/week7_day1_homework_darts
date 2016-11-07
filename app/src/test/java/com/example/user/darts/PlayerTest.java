package com.example.user.darts;
import org.junit.*;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {

    Player player;

    @Before
    public void beforeEach() {
        player = new Player("Phil Taylor", "The Power", 1);
        }

    @Test
    public void canGetName() {
        assertEquals("Phil Taylor", player.getName());
    }
}
