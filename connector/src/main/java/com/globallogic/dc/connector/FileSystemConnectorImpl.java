package com.globallogic.dc.connector;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class FileSystemConnectorImpl implements FileSystemConnector{

    private static FileSystemConnectorImpl instance;
    private List<String> rows = new ArrayList<>();

    public static FileSystemConnectorImpl getInstance() {
        if (instance == null) {
            synchronized (FileSystemConnectorImpl.class) {
                if (instance == null) {
                    instance = new FileSystemConnectorImpl();
                }
            }
        }
        return instance;
    }

    public List<String> readFile(final String fileName) {
        try {
            final File file =  new File(Objects.requireNonNull(getClass().getClassLoader().getResource(fileName)).getFile());
            final Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                rows.add(line);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return rows;
    }
}
