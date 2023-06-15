package com.company;

public class Data_3Exception extends Exception{

    public Data_3Exception() {
    }

    public void sexException(String i) {
        System.out.println("Exception: Data_3NotCorrectionFormat -(f / m)");
        System.out.printf("Введены неверные данные: %s", i);
        System.out.println();
    }
}
