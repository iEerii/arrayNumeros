//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        int suma = 0;
        double media;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];
        }
        System.out.println("la suma de los numeros es: " + suma);

        media = (double)suma / numeros.length;

        System.out.println("la media de los numeros es: " + media);
    }
}