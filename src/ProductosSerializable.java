import java.util.ArrayList;
import java.util.Scanner;
public class ProductosSerializable {
    public static void main(String[] args) {
        ArrayList<Producto> lista = new ArrayList<Producto>();
        Scanner sc = new Scanner(System.in);
        añadirLista add = new añadirLista();
        add.addProducto(lista);

        guardarArchivo guardar = new guardarArchivo();
        guardar.guardarBinario(lista);
        System.out.println("Lista de empleados guardados");

        System.out.println("Leyendo lista de empleados...");

        System.out.println("Introduce el precio minimo: ");
        double precio = sc.nextDouble();

        leerArchivo leer = new leerArchivo();
        leer.leerBinario(precio);
    }
}