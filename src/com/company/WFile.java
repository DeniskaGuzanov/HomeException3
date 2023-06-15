package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class WFile {

    public void writeData(String data, String way) {
        System.out.println(way);
        System.out.println(way.getClass().getSimpleName());
        try(FileWriter fileWriter = new FileWriter(way, true)) {
            fileWriter.append(data);
            fileWriter.append(" \n ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
