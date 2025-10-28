import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества знаков после запятой
        System.out.print("Введите количество знаков после запятой: ");
        int precision = scanner.nextInt();

        if (precision <= 0) {
            System.out.println("Введите положительное число.");
            return;
        }

        // Преобразуем число Pi с использованием BigDecimal
        BigDecimal pi = calculatePi(precision);

        // Выводим число Pi с нужной точностью
        System.out.println("Число Pi с точностью до " + precision + " знаков: ");
        String piStr = pi.toString();
        System.out.println(piStr.substring(0, precision + 2)); // Убираем точку и показываем только нужные знаки

        scanner.close();
    }

    // Алгоритм для вычисления числа Pi с высокой точностью
    public static BigDecimal calculatePi(int precision) {
        // Устанавливаем точность вычислений
        MathContext mc = new MathContext(precision + 2);  // +2 для учёта "3" и десятичной точки

        // Алгоритм Бэйли-Боруэйна-Платта для вычисления числа Pi
        BigDecimal sum = BigDecimal.ZERO;
        BigDecimal a = BigDecimal.valueOf(4);
        BigDecimal denominator = BigDecimal.ONE;
        BigDecimal factor = BigDecimal.ONE;

        for (int i = 0; i < precision; i++) {
            sum = sum.add(a.divide(denominator, mc));
            denominator = denominator.add(BigDecimal.valueOf(2));
            a = a.multiply(factor.negate());  // Чередуем знак
        }

        return sum;
    }
}
