package com.company;

public class Data_1Exception extends Exception {
    public Data_1Exception(){

    }

    public void dataException(String s) {
        System.out.println("Exception: Data_1NotCorrectionFormat");
        System.out.printf("Неверный формат: %s", s);
        System.out.println();
    }

}
