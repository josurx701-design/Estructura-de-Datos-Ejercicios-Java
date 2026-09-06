import java.util.Scanner;

public class proyecto9 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 23, 34, 45, 56, 67, 78, 89, 90};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número para buscarlo en el arreglo: ");
        int buscado = sc.nextInt();
        
        boolean encontrado = false;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("El número " + buscado + " SÍ se encuentra dentro del arreglo.");
        } else {
            System.out.println("El número " + buscado + " NO se encuentra en el arreglo.");
        }
    }
}