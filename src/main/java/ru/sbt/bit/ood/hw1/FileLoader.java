package ru.sbt.bit.ood.hw1;

import java.util.Map;

/**
 * Created by vitaly on 10/13/16.
 */
public abstract class FileLoader {

    protected final Attribute attribute;

    public FileLoader(Attribute attribute) {
        this.attribute = attribute;
    }

    abstract String downloadFile();
}
