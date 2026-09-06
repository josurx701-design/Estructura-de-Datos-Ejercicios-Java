public class proyecto8 {
    public static void main(String[] args) {
        int[] numeros = {12, 45, 78, 23, 56, 91, 34, 67};
        int mayor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        
        System.out.println("El número mayor dentro del arreglo es: " + mayor);
    }
}