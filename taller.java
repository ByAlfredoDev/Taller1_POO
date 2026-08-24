import java.util.Scanner;

public class taller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra base para tu contraseña: ");
        String palabra = sc.nextLine();

        // Métodos dinámicos de String
        String sinEspacios = palabra.trim();
        String minusculas = sinEspacios.toLowerCase();
        int longitud = minusculas.length();
        String palabraModificada = minusculas.replace('a', '@');
        char primeraLetra = minusculas.charAt(0);

        // Métodos estáticos de Math
        double aleatorio = Math.random();
        long numeroMagico = Math.round(aleatorio * 100);
        int longitudSegura = Math.max(longitud, 8);
        double nivelComplejidad = Math.pow(longitud, 2);
        int ajuste = Math.abs(-50);

        // Métodos estáticos de String
        String numStr = String.valueOf(numeroMagico);
        String boolStr = String.valueOf(longitud > 5);
        String reporte = String.format("Tu clave empezará con la letra: %s", primeraLetra);
        String claveFinal = String.join("-", palabraModificada, numStr, "X");
        char[] finArreglo = { 'F', 'i', 'n' };
        String mensajeFin = String.copyValueOf(finArreglo);

        System.out.println("\n" + reporte);
        System.out.println("¿La palabra ingresada tiene más de 5 letras?: " + boolStr);
        System.out.println("Longitud sugerida por seguridad (mínimo 8): " + longitudSegura);
        System.out.println("Nivel de complejidad calculado: " + nivelComplejidad + " (Ajuste: " + ajuste + ")");
        System.out.println("Tu NUEVA CLAVE es: " + claveFinal);
        System.out.println(mensajeFin);
    }
}
