package ru.sbt.bit.ood.hw1.download;

import org.apache.commons.net.ftp.FTPClient;
import ru.sbt.bit.ood.hw1.attribute.Attribute;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by vitaly on 10/13/16.
 */
public class FTPDownloader extends Downloader {

    public FTPDownloader(Attribute attribute) {
        super(attribute);
    }

    public String downloadFile(String filename) {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(attribute.getHost(), attribute.getPort());
            ftpClient.login(attribute.getLogin(), attribute.getPassword());
            File tempFile = File.createTempFile("trades", "download");
            OutputStream out = new FileOutputStream(tempFile);
            ftpClient.retrieveFile(filename, out);
            out.close();
            return tempFile.getAbsolutePath();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not download the file");
        }
    }
}
