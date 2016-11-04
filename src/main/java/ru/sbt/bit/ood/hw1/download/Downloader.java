package ru.sbt.bit.ood.hw1.download;

import ru.sbt.bit.ood.hw1.attribute.Attribute;

/**
 * Created by vitaly on 10/13/16.
 */
public abstract class Downloader {

    protected final Attribute attribute;

    public Downloader(Attribute attribute) {
        this.attribute = attribute;
    }

    public abstract String downloadFile(String filename);
}
