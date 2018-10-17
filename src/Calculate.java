package src;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculate {
    public static void main(String args[]) {
        Scanner operation = new Scanner(System.in);
        Scanner firstNumber = new Scanner(System.in);
        Scanner secondNumber = new Scanner(System.in);
        try {
            System.out.println("На данный момент поддерживается 4 типа операции: сложение, вычитание, умножение, деление. Введите тип операции: ");
            String nameOperation = operation.nextLine();
            nameOperation = nameOperation.replaceAll("[^-+*/]", "");

            if (!nameOperation.matches("^[-+*/]$")) {
                System.out.println("Неизвестный тип операции: " + nameOperation);
            } else {
                System.out.println("Введите первое число: ");
                String a = firstNumber.nextLine();
                double first = Double.parseDouble(a);


                System.out.println("Введите второе число: ");
                String b = secondNumber.nextLine();
                double second = Double.parseDouble(b);

                double result = 0;

                BigDecimal firstBD = new BigDecimal(first);
                BigDecimal secondDB = new BigDecimal(second);
                BigDecimal resultDB = new BigDecimal(result);

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
                System.out.println("Ответ: " + resultDB.setScale(1, BigDecimal.ROUND_DOWN));
            }
        } catch (NumberFormatException e){
            System.out.println("Во вводе обнаружены недопустимые символы. Допустимы только числа");
        } catch (ArithmeticException e){
            System.out.println("Ошибка: " + e);
        }
    }
}
