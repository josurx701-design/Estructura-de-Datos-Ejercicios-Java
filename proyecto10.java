package u1;
public class proyecto10 {
    public static void main(String[] args) {
        int[] numeros = {11, 24, 33, 40, 55, 62, 71, 88, 99, 100};
        int pares = 0;
        int impares = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}