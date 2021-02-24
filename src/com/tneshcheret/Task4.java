package com.tneshcheret;


import java.util.Random;

public class Task4 {
    private static final Random random = new Random();

    public static void main(String[] args) {
       /*
        Задание 4*) Создать генератор паролей, который будет генерировать случайные пароли по следующим правилам:
        Пароль состоит из 8 символов.
        В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания
        Пароль обязательно должен содержать Большие, маленькие буквы и цифры
        */
        createPassword();
    }

    private static void createPassword() {
        String[] passwordArray = new String[8];

        for (int i = 0; i < passwordArray.length; i++) {
            int randomSymbol = random.nextInt(4);

            if (randomSymbol == 0) {
                int numberSmallLetter = random.nextInt(25) + 97;
                char smallLetter = (char) numberSmallLetter;
                passwordArray[i] = String.valueOf(smallLetter);
            } else {
                if (randomSymbol == 1) {
                    int numberCapitalLetter = random.nextInt(25) + 65;
                    char capitalLetter = (char) numberCapitalLetter;
                    passwordArray[i] = String.valueOf(capitalLetter);
                } else {
                    if (randomSymbol == 2) {
                        int numeric = random.nextInt(9);
                        passwordArray[i] = String.valueOf(numeric);
                    } else {
                        char underline = '_';
                        passwordArray[i] = String.valueOf(underline);
                    }
                }
            }
        }
        addRequiredCharacters(passwordArray);
        convertArrayToString(passwordArray);
    }

    private static void addRequiredCharacters(String[] passwordArray) {
        int numberSmallLetterRequired = random.nextInt(25) + 97;
        char smallLetterRequired = (char) numberSmallLetterRequired;

        int a = random.nextInt(7);
        passwordArray[a] = String.valueOf(smallLetterRequired);

        int numberCapitalLetterRequired = random.nextInt(25) + 65;
        char capitalLetterRequired = (char) numberCapitalLetterRequired;
        int b = random.nextInt(7);
        while (b == a) {
            b = random.nextInt(7);
        }
        passwordArray[b] = String.valueOf(capitalLetterRequired);

        int numericRequired = random.nextInt(9);
        int c = random.nextInt(7);
        while (c == b | c == a) {
            c = random.nextInt(7);
        }
        passwordArray[c] = String.valueOf(numericRequired);
    }

    private static void convertArrayToString(String[] passwordArray) {
        StringBuilder password = new StringBuilder();
        for (String s : passwordArray) {
            password.append(s);
        }
        System.out.println(password);
    }
}

