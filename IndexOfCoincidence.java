/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class IndexOfCoincidence {

    public static void main(String[] args) {
        // Запрошуємо користувача ввести текст
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();
        scanner.close();

        // Розрахунок індексу відповідності
        double indexOfCoincidence = calculateIndexOfCoincidence(text);

        // Виведення результатів
        System.out.println("Індекс відповідності тексту: " + indexOfCoincidence);
    }

    private static double calculateIndexOfCoincidence(String text) {
        int totalCharacters = text.length();
        double indexOfCoincidence = 0.0;

        // Розрахунок суми для формули індексу відповідності
        for (char c = 'а'; c <= 'я'; c++) {
            int occurrences = countOccurrences(text, c);
            indexOfCoincidence += (double) (occurrences * (occurrences - 1)) / (totalCharacters * (totalCharacters - 1));
        }

        return indexOfCoincidence;
    }

    private static int countOccurrences(String text, char target) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.toLowerCase(c) == target) {
                count++;
            }
        }
        return count;
    }
}

