import java.util.ArrayList;

public class añadirLista {
    public void addProducto(ArrayList<Producto> lista) {
        lista.add(new Producto("Patatas", 4.50, 20));
        lista.add(new Producto("Filetes", 8.99, 12));
        lista.add(new Producto("Agua", 1.20, 50));
    }
}