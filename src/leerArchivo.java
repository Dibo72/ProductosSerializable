import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class leerArchivo {
    public void leerBinario(double precio) {
        try(ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Empleado.ser"))) {
            ArrayList<Producto> leido = (ArrayList<Producto>) lector.readObject();
            boolean existe = false;
            for (Producto producto : leido) {
                if (producto.getPrecio() > precio) {
                    System.out.println(producto);
                    existe = true;
                }
            }
            if (!existe) {
                System.out.println("No existe producto con precio superior a " + precio);
            }

        }catch (IOException | ClassNotFoundException e){
            System.out.println("No se puede leer el archivo " + e.getMessage());
        }
    }
}