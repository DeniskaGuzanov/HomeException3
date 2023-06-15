package com.company;

import java.util.Scanner;

public class InputData {

    public String[] enterData() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
            String data = scanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели данные не полностью");
            } else System.out.println("Введите дополнительные данные");
        }

    }
}
