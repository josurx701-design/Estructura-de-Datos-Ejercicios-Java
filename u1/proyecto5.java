package u1;
public class proyecto5 {
    public static void main(String[] args) {
        System.out.println("Números del 1 al 100 e identificación de divisibilidad entre 2 y 3:");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " -> Es divisible entre 2 y 3");
            } else {
                System.out.println(i);
            }
        }
    }
}