import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс, который запускает программы для факторизации числа и суммирования цифр числа.
 */
public class Main {
    public static void main(String[] args) {
        int number = 28;

        // Создаем экземпляр класса Factorization и вызываем метод для факторизации числа
        Factorization factorization = new Factorization();
        System.out.println("Факторы числа " + number + ": " + factorization.factorize(number));

        // Создаем экземпляр класса SumOfDigits и вызываем метод для вычисления суммы цифр числа
        SumOfDigits sumOfDigits = new SumOfDigits();
        System.out.println("Сумма цифр числа " + number + ": " + sumOfDigits.calculateSumOfDigits(number));
    }

    /**
     * Класс для факторизации числа.
     */
    static class Factorization {
        /**
         * Метод для нахождения всех факторов числа.
         *
         * @param number число, которое необходимо факторизовать
         * @return список факторов числа
         */
        public List<Integer> factorize(int number) {
            List<Integer> factors = new ArrayList<>();
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factors.add(i);
                }
            }
            return factors;
        }
    }

    /**
     * Класс для вычисления суммы цифр числа.
     */
    static class SumOfDigits {
        /**
         * Метод для вычисления суммы цифр числа.
         *
         * @param number число, сумму цифр которого необходимо вычислить
         * @return сумма цифр числа
         */
        public int calculateSumOfDigits(int number) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }
}