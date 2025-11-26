public class Main {
    public static void main(String[] args) {
        // 1. Прямое присваивание
        Boolean bool1 = true;
        Boolean bool2 = false;
        
        // 2. Конструктор (устарел)
        Boolean bool3 = new Boolean(true);
        Boolean bool4 = new Boolean(false);
        
        // 3. valueOf()
        Boolean bool5 = Boolean.valueOf(true);
        Boolean bool6 = Boolean.valueOf(false);
        
        // 4. valueOf() из строки
        Boolean bool7 = Boolean.valueOf("true");
        Boolean bool8 = Boolean.valueOf("false");
        Boolean bool9 = Boolean.valueOf("TRUE");
        Boolean bool10 = Boolean.valueOf("anything"); // false
        
        // 5. parseBoolean()
        boolean bool11 = Boolean.parseBoolean("true");
        boolean bool12 = Boolean.parseBoolean("false");
        
        System.out.println(bool1);    // true
        System.out.println(bool2);    // false
        System.out.println(bool7);    // true
        System.out.println(bool10);   // false
        System.out.println(bool11);   // true
    }
}