package modelo;

public class Repuesto {
    
   private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;
    private boolean estado;

    public Repuesto(int codigo, String nombre, String descripcion, double precio, int cantidad, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.estado = estado;
    }

 

    public int getCodigo() {
        return codigo;
    }
    public boolean isEstado() {
         return estado;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(boolean estado) {
         this.estado = estado;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
    
}
