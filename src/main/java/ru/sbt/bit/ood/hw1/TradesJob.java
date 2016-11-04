package ru.sbt.bit.ood.hw1;

import ru.sbt.bit.ood.hw1.download.Downloader;
import ru.sbt.bit.ood.hw1.parse.Parser;

import java.util.List;

public class TradesJob {

    private final TradesDAO tradesDAO;

    public TradesJob(TradesDAO tradesDAO) {
        this.tradesDAO = tradesDAO;
    }

    public void run(String filename, Downloader downloader, TradesDAO tradesDAO, Parser parser) {
        String file = downloader.downloadFile(filename);
        List<Trade> trades = parser.parse(file);
        tradesDAO.updateTrades(trades);
    }
}
