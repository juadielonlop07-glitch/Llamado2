public class Producto {

    private String codigo;
    private String nombre;
    private double precioUnitario;
    private int cantidadStock;

    public Producto(String codigo, String nombre, double precioUnitario, int cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) {
            this.precioUnitario = precioUnitario;
        }
    }

    public boolean aumentarStock(int cantidad) {
        if (cantidad > 0) {
            cantidadStock += cantidad;
            return true;
        }
        return false;
    }

    public boolean disminuirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= cantidadStock) {
            cantidadStock -= cantidad;
            return true;
        }
        return false;
    }

    public double calcularValorTotal() {
        return precioUnitario * cantidadStock;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                " | Nombre: " + nombre +
                " | Precio: $" + precioUnitario +
                " | Stock: " + cantidadStock;
    }
}