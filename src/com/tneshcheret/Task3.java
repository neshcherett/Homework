package com.tneshcheret;

public class Task3 {

    public static void main(String[] args) {
        /*
        Задание 3*) Написать метод. Входящий параметр: Строка со словами разделенными пробелом которые состоят из больших и маленьких букв.
        Метод должен вернуть ту же строку в которой первая буква в каждом слове большая, а остальные маленькие
        */
        String s = "БыстрЕЕ бЕгаЕШь - быСтрЕе доБегаешь";
        normalizeString(s);
    }

    private static void normalizeString(String s) {
        s = s.toLowerCase();
        String[] dividedString = s.split("\\s+");
        StringBuilder unitedString = new StringBuilder();

        for (int i = 0; i < dividedString.length; i++) {
            char ch;
            if (i == dividedString.length - 1) {
                ch = dividedString[i].charAt(0);
                ch = Character.toUpperCase(ch);
                dividedString[i] = dividedString[i].replace(dividedString[i].charAt(0), ch);
                unitedString.append(dividedString[i]);
            } else {
                ch = dividedString[i].charAt(0);
                ch = Character.toUpperCase(ch);
                dividedString[i] = dividedString[i].replace(dividedString[i].charAt(0), ch);
                unitedString.append(dividedString[i]).append(" ");
            }
        }
        printNormalizeString(unitedString);
    }

    private static void printNormalizeString(StringBuilder unitedString) {
        System.out.println(unitedString);
    }
}


