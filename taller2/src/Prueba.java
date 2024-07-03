import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        // Crear un objeto Rectangulo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();
        System.out.print("Ingrese el alto del rectángulo: ");
        double alto = scanner.nextDouble();

        Rectangulo miRectangulo = new Rectangulo(ancho,alto);


        // Imprimir información sobre el rectángulo
        miRectangulo.imprimirInformacion();
        if (miRectangulo.esCuadrado()) {
            System.out.println("El rectángulo es un cuadrado.");
        } else {
            System.out.println("El rectángulo no es un cuadrado.");
        }
    }
}