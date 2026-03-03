import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> listaProductos;

    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    public boolean registrarProducto(String codigo, String nombre, double precio, int stock) {

        if (precio < 0 || stock < 0) {
            return false;
        }

        if (buscarProducto(codigo) != null) {
            return false; 
        }

        Producto nuevo = new Producto(codigo, nombre, precio, stock);
        listaProductos.add(nuevo);
        return true;
    }
