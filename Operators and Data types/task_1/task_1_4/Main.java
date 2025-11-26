public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        int num = 52;
        double pi = 3.14;

        // Конкатенация строки с int
        String result1 = str + " " + num; // "Hello 52"
        System.out.println(result1);

        // Конкатенация строки с double
        String result2 = str + " " + pi; // "Hello 3.14"
        System.out.println(result2);

        // Конкатенация нескольких значений
        String result3 = str + " " + num + " " + pi; // "Hello 52 3.14"
        System.out.println(result3);
        
        // Конкатенация с объекстом класса TestClass
        String result4 = str + " " + new TestClass("Test", 4);
        System.out.println(result4);
    }
}