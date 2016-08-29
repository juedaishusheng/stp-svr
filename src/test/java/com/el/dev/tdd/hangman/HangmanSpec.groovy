package com.el.dev.tdd.hangman

import spock.lang.Specification

/**
 * Created on 16/3/15.
 *
 * @author panlw
 */
class HangmanSpec extends Specification {

    def "开始游戏"() {
        setup:
        Hangman hangman = new Hangman()
        hangman.start("HELLO")

        expect:
        hangman.problem() == "_____"
        hangman.chances() == 10
        hangman.fail() == false
        hangman.succ() == false
    }

    def "猜错了一个字母"() {
        setup:
        Hangman hangman = new Hangman()
        hangman.start("HELLO")

        when:
        hangman.guest('A' as char)

        then:
        hangman.problem() == "_____"
        hangman.chances() == 9
        hangman.fail() == false
        hangman.succ() == false
    }

    def "猜中了一个字母"() {
        setup:
        Hangman hangman = new Hangman()
        hangman.start("HELLO")

        when:
        hangman.guest('E' as char)

        then:
        hangman.problem() == "_E___"
        hangman.chances() == 10
        hangman.fail() == false
        hangman.succ() == false
    }

    def "猜中了一个出现多次的字母"() {
        setup:
        Hangman hangman = new Hangman()
        hangman.start("HELLO")

        when:
        hangman.guest('L' as char)

        then:
        hangman.problem() == "__LL_"
        hangman.chances() == 10
        hangman.fail() == false
        hangman.succ() == false
    }

    def "10次机会都用掉了,失败:("() {
        setup:
        Hangman hangman = new Hangman()
        hangman.start("HELLO")

        when:
        10.times({ hangman.guest('X' as char) })

        then:
        hangman.problem() == "_____"
        hangman.chances() == 0
        hangman.fail() == true
        hangman.succ() == false
    }

    def "全猜对了,成功:)"() {
        setup:
        Hangman hangman = new Hangman()
        hangman.start("HELLO")

        when:
        hangman.guest('H' as char)
        hangman.guest('E' as char)
        hangman.guest('L' as char)
        hangman.guest('O' as char)

        then:
        hangman.problem() == "HELLO"
        hangman.chances() == 10
        hangman.fail() == false
        hangman.succ() == true
    }
}
