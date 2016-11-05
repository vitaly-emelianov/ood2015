package ru.sbt.bit.ood.hw1;

import com.google.inject.Inject;
import ru.sbt.bit.ood.hw1.download.Downloader;
import ru.sbt.bit.ood.hw1.parse.Parser;

import java.util.List;

public class TradesJob {

    private final TradesDAO tradesDAO;
    private final Downloader downloader;
    private final Parser parser;

    @Inject
    public TradesJob(TradesDAO tradesDAO, Downloader downloader, Parser parser) {
        this.tradesDAO = tradesDAO;
        this.downloader = downloader;
        this.parser = parser;
    }

    public void run(String filename) {
        String file = downloader.downloadFile(filename);
        List<Trade> trades = parser.parse(filename);
        tradesDAO.updateTrades(trades);
    }

    public void testGoogleJuice() {
        downloader.downloadFile("text.txt");
        parser.parse("test.txt");
    }
}
