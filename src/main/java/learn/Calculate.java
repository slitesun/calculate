package learn;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculate {
    public static void main(String args[]) {
        System.out.println("На данный момент поддерживается 4 типа операции: сложение, вычитание, умножение, деление. Введите тип операции: ");
        String nameOperation = new Scanner(System.in).nextLine();
        if (!nameOperation.matches("^[-+*/]$")) {
            System.out.println("Неизвестный тип операции: " + nameOperation);
            System.exit(0);
        }

        try {
            System.out.println("Введите первое число: ");
            BigDecimal firstBD = new BigDecimal(Double.parseDouble(new Scanner(System.in).nextLine()));

            System.out.println("Введите второе число: ");
            BigDecimal secondDB = new BigDecimal(Double.parseDouble(new Scanner(System.in).nextLine()));

            BigDecimal resultDB = new BigDecimal(0);

            switch (nameOperation) {
                case "+":
                    resultDB = firstBD.add(secondDB);
                    break;

                case "-":
                    resultDB = firstBD.subtract(secondDB);
                    break;

                case "*":
                    resultDB = firstBD.multiply(secondDB);
                    break;

                case "/":
                    resultDB = firstBD.divide(secondDB, 1, BigDecimal.ROUND_DOWN);
                    break;

                default:
                    break;
            }
            System.out.println("Ответ: " + resultDB.setScale(2, BigDecimal.ROUND_DOWN));
        } catch (ArithmeticException e) {
            System.out.println("Анус свой подели на ноль пёс");
        } catch (NumberFormatException e){
            System.out.println("Во вводе обнаружены недопустимые символы. Допустимы только числа");
        }
    }
}
