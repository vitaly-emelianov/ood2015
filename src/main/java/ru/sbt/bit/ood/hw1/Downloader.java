package ru.sbt.bit.ood.hw1;

import java.util.List;
import java.util.Map;

/**
 * Created by vitaly on 10/13/16.
 */
public abstract class Downloader {

    protected final Attribute attribute;

    public Downloader(Attribute attribute) {
        this.attribute = attribute;
    }

    public abstract String downloadFile();
}
