package ru.sbt.bit.ood.hw1.parse;

import ru.sbt.bit.ood.hw1.Trade;

import java.util.List;

/**
 * Created by vitaly on 04.11.16.
 */
public class DummyParser implements Parser {
    public List<Trade> parse(String filename) {
        System.out.println("File was parsed successfully.");
        return null;
    }
}
