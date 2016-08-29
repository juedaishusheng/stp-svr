package com.el.dev.tdd.hangman;

/**
 * Created on 16/2/17.
 *
 * @author panlw
 */
public class Hangman {

    public static final int MAX_CHANCES = 10;

    private int chances = MAX_CHANCES;

    private String word;
    private char[] problem;

    private static char[] makeProblem(String word) {
        char[] blank = new char[word.length()];
        for (int i = 0, n = word.length(); i < n; i++) {
            blank[i] = '_';
        }
        return blank;
    }

    /**
     * @param word 用于猜谜的单词
     */
    public void start(String word) {
        this.word = word;
        this.problem = makeProblem(word);
    }

    /**
     * @return 给出的问题
     */
    public String problem() {
        return String.valueOf(this.problem);
    }

    /**
     * @return 剩余机会数(也就是最多能猜错的次数)
     */
    public int chances() {
        return this.chances;
    }

    /**
     * @return 失败了吗?
     */
    public boolean fail() {
        return this.chances == 0;
    }

    /**
     * @return 成功了吗?
     */
    public boolean succ() {
        return word.equals(problem());
    }

    /**
     * @param ch 猜一个字母
     */
    public void guest(char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) {
            LostAChance();
        } else {
            ShowLetters(ch, idx);
        }
    }

    private void LostAChance() {
        this.chances -= 1;
    }

    private void ShowLetters(char ch, int idx) {
        while (idx != -1) {
            this.problem[idx] = ch;
            idx = word.indexOf(ch, idx + 1);
        }
    }

}
