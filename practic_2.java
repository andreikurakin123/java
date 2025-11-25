import java.io.IOException;

public class practic_2 {
    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        
        try {
            StringBuilder name = new StringBuilder();
            int character;
            
            while ((character = System.in.read()) != '\n' && character != -1) {
                name.append((char) character);
            }
            
            System.out.println("Привет, " + name.toString());
            
        } catch (IOException e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }
}