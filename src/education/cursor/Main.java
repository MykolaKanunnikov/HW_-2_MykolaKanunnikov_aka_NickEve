package education.cursor;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//      1. Заповнити масив тільки парними числами
        int[] setOfNumbers = new int[10];
        for (int counter = 0, a = 2; counter < setOfNumbers.length; counter++) {
            setOfNumbers[counter] = a += 2;
        }
        System.out.println("1. Array of even numbers: " + Arrays.toString(setOfNumbers));

//      2. Заповнити масив рандомними числами
        int[] arrayOfRandomNumbers = new Random().ints(10, 0, 100).toArray();
        System.out.println("2. Array of random numbers: " + Arrays.toString(arrayOfRandomNumbers));

//      3. Вивести середнє значення масиву
        double totalValue = 0, averageValue;
        for (int counter = 0, temp; counter < arrayOfRandomNumbers.length; counter++) {
            temp = arrayOfRandomNumbers[counter];
            totalValue += temp;
        }
        averageValue = totalValue / arrayOfRandomNumbers.length;
        System.out.println("3. Average value for array of random numbers is " + averageValue);

//      4. Вивести суму всіх значень кратних 3
        double totalZeroFromDividingBy3 = 0;
        for (int counter = 0; counter < arrayOfRandomNumbers.length; counter++) {
            if (counter % 3 == 0) {
                totalZeroFromDividingBy3 += counter;
            }
        }
        System.out.println("4. Total of values duly divided by 3 is " + totalZeroFromDividingBy3);

//      5. Вивести значення всіх парних індексів масиву
        System.out.print("5. List of even indexes: ");
        for (int counter = 2; counter < arrayOfRandomNumbers.length; counter += 2) {
            System.out.print(counter + " ");
        }
        System.out.println(" ");

//      6. Просортувати масив в порядку зростання
        Arrays.sort(arrayOfRandomNumbers);
        System.out.println("6. Sorted array of random numbers: " + Arrays.toString(arrayOfRandomNumbers));

//      7. Вивести найменше значення в масиві
        System.out.println("7. The smallest value in the array of random numbers is "
                + Arrays.toString(new int[]{arrayOfRandomNumbers[0]}));

//      8. Вивести найбільше значення масиву
        System.out.println("8. The highest value in the array of random numbers is "
                + Arrays.toString(new int[]{arrayOfRandomNumbers[arrayOfRandomNumbers.length - 1]}));

//      9. Вивести суму значень всіх парних індексів
        int totalOfEvenIndexes = 0;
        for (int counter = 2; counter < arrayOfRandomNumbers.length; counter += 2) {
            totalOfEvenIndexes += counter;
        }
        System.out.println("9. Total of even indexes is " + totalOfEvenIndexes);

//      10. Вивести перших 20 символів з таблиці ASCII
        String[] firstTwentyChars = new String[19];
        String ASCII_Character;
        for (int counter = 0; counter < firstTwentyChars.length; counter++) {
            // convert each value into character
            char character = (char) counter;
            // check whether character is whitespace or not
            if (Character.isWhitespace(character)) {
                ASCII_Character = switch (character) {
                    case '\r' -> "\\r";
                    case '\t' -> "\\t";
                    case '\n' -> "\\n";
                    case '\f' -> "\\f";
                    // case ' ' -> "space"; // unreachable with provided array length (0-19)
                    default -> "whitespace";
                };
                // detect characters that are not letters, digits and punctuation
            } else if (Character.isISOControl(character)) {
                ASCII_Character = "control";
            } else {
                // showing others chars
                ASCII_Character = Character.toString(character);
            }
            firstTwentyChars[counter] = (ASCII_Character);
        }
        System.out.println("10. First 20 chars from ASCII table: \n" + Arrays.toString(firstTwentyChars));

//      Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними
        int[] arrayOfRandomNumbers2 = new Random().ints(15, 0, 100).toArray();
        System.out.println("\n11. Second array of random numbers: " + Arrays.toString(arrayOfRandomNumbers2));

        int valueEvenTemp = 0, valueOddTemp = 0, indexTempOfEven = 0, indexTempOfOdd = 0;
        for (int counter = 0; counter < arrayOfRandomNumbers2.length; counter++) {
            if (arrayOfRandomNumbers2[counter] % 2 == 0) {
                indexTempOfEven = counter;
                valueEvenTemp = arrayOfRandomNumbers2[counter];

            } else {
                indexTempOfOdd = counter;
                valueOddTemp = arrayOfRandomNumbers2[counter];
            }
            arrayOfRandomNumbers2[indexTempOfOdd] = valueEvenTemp;
            arrayOfRandomNumbers2[indexTempOfEven] = valueOddTemp;
        }
        System.out.println("11.1 Odd and even numbers replaced: " + Arrays.toString(arrayOfRandomNumbers2));

    }
}