package ru.sbt.bit.ood.hw1.parse;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import ru.sbt.bit.ood.hw1.Trade;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by vitaly on 10/13/16.
 */
public class CSVParser implements Parser {
    public List<Trade> parse(String filename) {
        try {
            Reader in = new FileReader(filename);
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            List<Trade> trades = new ArrayList();
            for (CSVRecord record : records) {
                Map<String, String> tradeFieldValues = record.toMap();
                trades.add(new Trade(tradeFieldValues));
            }
            return trades;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("There was an error while parsing CSV file");
        }
    }
}
