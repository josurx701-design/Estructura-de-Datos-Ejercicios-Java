public class proyecto7 {
    public static void main(String[] args) {
        int[] numeros = {15, 25, 8, 42, 10};
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        
        double promedio = (double) suma / numeros.length;
        
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}