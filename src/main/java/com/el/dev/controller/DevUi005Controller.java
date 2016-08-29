package com.el.dev.controller;

import com.el.dev.domain.DevUi005Book;
import com.el.dev.domain.DevUi005Fruit;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created on 16/7/26.
 *
 * @author panlw
 */
@Profile({"dev", "neo"})
@RestController
@RequestMapping("/api/ui")
public class DevUi005Controller {

    @RequestMapping("/ui005_fruits")
    public List<DevUi005Fruit> fruits() {
        return Arrays.asList(
            createFruit("red", "apple"),
            createFruit("yellow", "banana"),
            createFruit("green", "pear")
        );
    }

    @RequestMapping("/ui005/fruits")
    public List<DevUi005Fruit> fruits2() {
        return fruits();
    }

    private static DevUi005Fruit createFruit(String color, String label) {
        return new DevUi005Fruit() {{
            setColor(color);
            setLabel(label);
        }};
    }

    @RequestMapping("/ui005_books")
    public List<DevUi005Book> books(
        @RequestParam(name = "rev", required = false) String reverse) {
        List<DevUi005Book> books = Arrays.asList(
            createBook("blue", "A", "Clean Code", "978-7-115-37675-1"),
            createBook("orange", "B", "Refactor", "978-7-115-37675-2"),
            createBook("purple", "C", "Domain-Driven Design", "978-7-115-37675-3")
        );
        if (reverse != null) {
            Collections.reverse(books);
        }
        return books;
    }

    @RequestMapping("/ui005/books")
    public List<DevUi005Book> books2() {
        return books("1");
    }

    private static DevUi005Book createBook(String color, String code, String name, String isbn) {
        return new DevUi005Book() {{
            setColor(color);
            setCode(code);
            setName(name);
            setIsbn(isbn);
        }};
    }

    @RequestMapping("/ui005_my_book")
    public String myBook() {
        return "B";
    }

}
