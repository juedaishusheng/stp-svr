package com.el.dev.tdd.hangman;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 16/3/15.
 *
 * @author panlw
 */
public class HangmanTest {

    /**
     * 启动一个猜字母游戏
     * @throws Exception
     */
    @Test
    public void start_game() throws Exception {
        Hangman hangman = new Hangman();
        hangman.start("HELLO");
        assertEquals("_____", hangman.problem());
        assertEquals(10, hangman.chances());
        assertFalse(hangman.fail());
        assertFalse(hangman.succ());
    }

    /**
     * 猜错一个字母
     * @throws Exception
     */
    @Test
    public void guest_a_wrong_letter() throws Exception {
        Hangman hangman = new Hangman();
        hangman.start("HELLO");

        hangman.guest('A');

        assertEquals("_____", hangman.problem());
        assertEquals(9, hangman.chances());
        assertFalse(hangman.fail());
        assertFalse(hangman.succ());
    }

    /**
     * 猜对一个字母
     * @throws Exception
     */
    @Test
    public void guest_a_right_letter() throws Exception {
        Hangman hangman = new Hangman();
        hangman.start("HELLO");

        hangman.guest('E');

        assertEquals("_E___", hangman.problem());
        assertEquals(10, hangman.chances());
        assertFalse(hangman.fail());
        assertFalse(hangman.succ());
    }

    /**
     * 猜对一个出现多次的字母
     * @throws Exception
     */
    @Test
    public void guest_a_right_letter_that_is_multiple() throws Exception {
        Hangman hangman = new Hangman();
        hangman.start("HELLO");

        hangman.guest('L');

        assertEquals("__LL_", hangman.problem());
        assertEquals(10, hangman.chances());
        assertFalse(hangman.fail());
        assertFalse(hangman.succ());
    }

    /**
     * 所有机会都没了
     * @throws Exception
     */
    @Test
    public void lost_all_chances() throws Exception {
        Hangman hangman = new Hangman();
        hangman.start("HELLO");

        for (int i = 0; i < 10; i++) {
            hangman.guest('X');
        }

        assertEquals("_____", hangman.problem());
        assertEquals(0, hangman.chances());
        assertTrue(hangman.fail());
        assertFalse(hangman.succ());
    }

    /**
     * 猜对了所有的字母
     * @throws Exception
     */
    @Test
    public void guest_all_letters() throws Exception {
        Hangman hangman = new Hangman();
        hangman.start("HELLO");

        hangman.guest('H');
        hangman.guest('E');
        hangman.guest('L');
        hangman.guest('O');

        assertEquals("HELLO", hangman.problem());
        assertEquals(10, hangman.chances());
        assertFalse(hangman.fail());
        assertTrue(hangman.succ());
    }
}
