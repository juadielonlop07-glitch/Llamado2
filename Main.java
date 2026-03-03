import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion = 0;

        do {
            System.out.println("\n===== MENÚ INVENTARIO =====");
            System.out.println("1. Registrar producto");
            System.out.println("2. Agregar unidades");
            System.out.println("3. Retirar unidades");
            System.out.println("4. Mostrar todos los productos");
            System.out.println("5. Mostrar productos con bajo stock");
            System.out.println("6. Calcular valor total del inventario");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");