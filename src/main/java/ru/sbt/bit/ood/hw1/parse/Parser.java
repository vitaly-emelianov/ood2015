package ru.sbt.bit.ood.hw1.parse;

import ru.sbt.bit.ood.hw1.Trade;

import java.util.List;

/**
 * Created by vitaly on 10/13/16.
 */
public interface Parser {
    List<Trade> parse(String filename);
}
