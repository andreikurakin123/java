public class SimpleOperators {
    public static void main(String[] args) {
        // С числами
        int a = 10;
        int b = 3;
        
        System.out.println(a + b);  // 13
        System.out.println(a - b);  // 7
        System.out.println(a * b);  // 30
        System.out.println(a / b);  // 3
        System.out.println(a % b);  // 1
        
        // Со строками
        String s1 = "Hello";
        String s2 = "World";
        
        System.out.println(s1 + " " + s2);  // Hello World
        
        // Префиксная и постфиксная форма
        int x = 5;
        System.out.println(++x);  // 6 (сначала увеличили, потом вывели)
        
        int y = 5;
        System.out.println(y++);  // 5 (сначала вывели, потом увеличили)
        System.out.println(y);    // 6
        
        int z = 8;
        System.out.println(--z);  // 7 (сначала уменьшили, потом вывели)
        
        int w = 8;
        System.out.println(w--);  // 8 (сначала вывели, потом уменьшили)
        System.out.println(w);    // 7
    }
}