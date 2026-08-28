package u1;

import java.util.Scanner;

public class proyecto2 {
    
    public static void main(String[] args) {
        final double IVA_PORCENTAJE = 21.0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el precio de un producto:");
        double precioOriginal = sc.nextDouble();
        
        
        double montoIVA = precioOriginal * (IVA_PORCENTAJE / 100);
        double precioFinal = precioOriginal + montoIVA;
        
        
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Porcentaje de IVA aplicado: " + IVA_PORCENTAJE + "%");
        System.out.println("Precio final con IVA: $" + precioFinal);
    }

}