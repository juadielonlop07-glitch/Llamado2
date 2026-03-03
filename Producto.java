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