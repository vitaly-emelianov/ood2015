package ru.sbt.bit.ood.hw1;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.net.ftp.FTPClient;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class TradesJob {

    private final TradesDAO tradesDAO;

    public TradesJob(TradesDAO tradesDAO) {
        this.tradesDAO = tradesDAO;
    }

    public void run(String host, int port, String login, String password) {
        Attribute attribute = new Attribute("localhost", 8888, "user", "123");
        FileLoader loader = new FTPFileLoader(attribute);
        String filename = loader.downloadFile();
        Parser parser = new CSVParser();
        Iterable tradeRecords = parser.parse(filename);
        updateTrades(tradeRecords);
    }

    private void updateTrades(Iterable<CSVRecord> trades) {
        tradesDAO.deleteAll();
        for (CSVRecord tradeRecord : trades) {
            Trade trade = new Trade(tradeRecord.toMap());
            tradesDAO.save(trade);
        }
    }
}
