import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class guardarArchivo {
    public void guardarBinario(ArrayList<Producto> lista) {
        try(ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("Empleado.ser"))) {
            escribir.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo" + e.getMessage());
        }
    }
}