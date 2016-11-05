package ru.sbt.bit.ood.hw1;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import ru.sbt.bit.ood.hw1.download.Downloader;
import ru.sbt.bit.ood.hw1.download.DummyDownloader;
import ru.sbt.bit.ood.hw1.parse.DummyParser;
import ru.sbt.bit.ood.hw1.parse.Parser;

/**
 * Created by vitaly on 05.11.16.
 */
public class TradingModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Parser.class).to(DummyParser.class);
        bind(Downloader.class).to(DummyDownloader.class);
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TradingModule());
        TradesJob tradesJob = injector.getInstance(TradesJob.class);
        tradesJob.testGoogleJuice();
    }
}
