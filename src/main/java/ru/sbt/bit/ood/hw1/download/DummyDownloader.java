package ru.sbt.bit.ood.hw1.download;

import ru.sbt.bit.ood.hw1.attribute.Attribute;

/**
 * Created by vitaly on 04.11.16.
 */
public class DummyDownloader extends Downloader {

    public DummyDownloader(){

    }
    public DummyDownloader(Attribute attribute) {
        super(attribute);
    }

    public String downloadFile(String filename) {
        System.out.println("File was downloaded successfully.");
        return null;
    }
}
