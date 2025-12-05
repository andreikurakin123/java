class Outer {
    // Внутренние классы с разными модификаторами
    private class PrivateInner {
        void show() { System.out.println("PrivateInner"); }
        //answer.md
        
    }
    
    class PackageInner {
        void show() { System.out.println("PackageInner"); }
    }
    
    public class PublicInner {
        void show() { System.out.println("PublicInner"); }
    }
    
    void test() {
        PrivateInner p = new PrivateInner();  // Доступно
        PackageInner d = new PackageInner();   // Доступно
        PublicInner u = new PublicInner();     // Доступно
    }
}

class Test {
    void test() {
        Outer outer = new Outer();
        // Outer.PrivateInner p = outer.new PrivateInner(); // Ошибка - private
        Outer.PackageInner d = outer.new PackageInner();     // Доступно
        Outer.PublicInner u = outer.new PublicInner();       // Доступно
    }
}