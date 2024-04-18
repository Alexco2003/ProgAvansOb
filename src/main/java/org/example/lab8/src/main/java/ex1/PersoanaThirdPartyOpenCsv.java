package org.example.lab8.src.main.java.ex1;

import com.opencsv.CSVWriter;
import org.example.lab8.src.main.java.ex1.Persoana;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersoanaThirdPartyOpenCsv {
    private static final String SEPARATOR = ",";

    public static void main(String[] args) {
        List<Persoana> dataLines = buildSampleData();
        writeUsingOpenCsv(dataLines);
    }

    private static List<Persoana> buildSampleData() {
        List<Persoana> sampleDataLines = new ArrayList<>();
        sampleDataLines.add(new Persoana("Dogaru", "Mihail", 20, "dogarumihail@gmail.com"));
        sampleDataLines.add(new Persoana("Popescu", "Ion", 30, "popescuion@gmail.com"));
        sampleDataLines.add(new Persoana("Hutanu", "Ciprian", 70, "hutanuciprian@gmail.com"));
        return sampleDataLines;
    }

    private static void writeUsingOpenCsv(List<Persoana> dataLines) {
        try (CSVWriter writer = new CSVWriter(new FileWriter("./src/main/java/org/example/lab8/src/main/java/ex1/persoane.csv"))) {
            for (Persoana line : dataLines) {
                writer.writeNext(new String[] {line.getNume(), line.getPrenume(), String.valueOf(line.getVarsta()), line.getEmail()}, false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
