package com.company;

public class Data_2Exception extends Exception{

    public Data_2Exception(){

    }

    public void dataException(String i) {
        System.out.println("Exception: Date_2ExceptionNotFormat -(dd.mm.yyyy)");
        System.out.printf("Неверный формат даты: %s", i);
        System.out.println();
    }

}
