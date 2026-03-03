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

      public Producto buscarProducto(String codigo) {
        for (Producto p : listaProductos) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    public boolean agregarUnidades(String codigo, int cantidad) {
        Producto p = buscarProducto(codigo);
        if (p != null) {
            return p.aumentarStock(cantidad);
        }
        return false;
    }

    public boolean retirarUnidades(String codigo, int cantidad) {
        Producto p = buscarProducto(codigo);
        if (p != null) {
            return p.disminuirStock(cantidad);
        }
        return false;
    }

    public void mostrarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : listaProductos) {
                System.out.println(p);
            }
        }
    }

    public void mostrarBajoStock() {
        for (Producto p : listaProductos) {
            if (p.getCantidadStock() < 5) {
                System.out.println(p);
            }
        }
    }

    public double calcularValorTotalInventario() {
        double total = 0;
        for (Producto p : listaProductos) {
            total += p.calcularValorTotal();
        }
        return total;
    }
}