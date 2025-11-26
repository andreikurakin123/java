/**
 * Класс для вычисления простых математических операций
 * @author Андрей
 * @version 1.0
 */
public class Calculator {
    
    /**
     * Метод для сложения двух чисел
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Метод для проверки четности числа
     * @param number число для проверки
     * @return true если число четное, false если нечетное
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    /**
     * Главный метод программы
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Сложение чисел
        int result = calc.add(5, 3);
        System.out.println("5 + 3 = " + result);
        
        // Проверка четности
        boolean even = calc.isEven(10);
        System.out.println("10 четное? " + even);
    }
}