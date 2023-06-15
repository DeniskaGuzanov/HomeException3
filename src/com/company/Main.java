package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Parsing parsing = new Parsing(); // Создается объект класса Parsing
        String fileName = null; // Иннициализация переменной
        WFile wFile = new WFile(); // Создается объект класса WFile

        HashMap<String, Object> data = parsing.parsInputData(); // Иннициализация словаря
        while (data.size() != 6) {
            try {
                throw new Data_1Exception();
            } catch (Data_1Exception e) {
                data = parsing.parsInputData();
            }
        } // Цикл для ввода данных, пока пользователь не введет корректные данные

        fileName = data.get("lastName") + ".txt"; // Указывается файл для записи данных пользователя
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : data.keySet()) {
            stringBuilder.append(data.get(s));
            stringBuilder.append(" ");
        }


        System.out.println(data);
        String fileWay = fileName;
        System.out.println(fileWay);
        wFile.writeData(String.valueOf(stringBuilder), fileName); // Вызывается метод класса WFile для записи в файл


    }
}
