package ru.sbt.bit.ood.hw1;

import java.util.List;

public class TradesJob {

    private final TradesDAO tradesDAO;

    public TradesJob(TradesDAO tradesDAO) {
        this.tradesDAO = tradesDAO;
    }

    public void run(Downloader downloader, TradesDAO tradesDAO, Parser parser) {
        String filename = downloader.downloadFile();
        List<Trade> trades = parser.parse(filename);
        tradesDAO.updateTrades(trades);
    }
}
