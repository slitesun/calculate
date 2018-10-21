package learn;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculate {
    public static void main(String args[]) {
        System.out.println("На данный момент поддерживается 4 типа операции: сложение, вычитание, умножение, деление. Введите тип операции: ");
        String nameOperation = new Scanner(System.in).nextLine().replaceAll("[\\s]", "");
        if (!nameOperation.matches("^[-+*/]$")) {
            System.out.println("Неизвестный тип операции: " + nameOperation);
            System.exit(0);
        }

        try {
            System.out.println("Введите первое число: ");
            BigDecimal first = new BigDecimal(Double.parseDouble(new Scanner(System.in).nextLine()));

            System.out.println("Введите второе число: ");
            BigDecimal second = new BigDecimal(Double.parseDouble(new Scanner(System.in).nextLine()));

            BigDecimal result = new BigDecimal(0);

            switch (nameOperation) {
                case "+":
                    result = first.add(second);
                    break;

                case "-":
                    result = first.subtract(second);
                    break;

                case "*":
                    result = first.multiply(second);
                    break;

                case "/":
                    result = first.divide(second, 1, BigDecimal.ROUND_DOWN);
                    break;

                default:
                    break;
            }
            System.out.println("Ответ: " + result.setScale(2, BigDecimal.ROUND_DOWN));

        } catch (ArithmeticException e) {
            System.out.println("Анус свой подели на ноль пёс");
        } catch (NumberFormatException e){
            System.out.println("Во вводе обнаружены недопустимые символы. Допустимы только числа");
        }
    }
}
