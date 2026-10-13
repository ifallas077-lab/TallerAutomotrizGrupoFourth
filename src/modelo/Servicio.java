package modelo;


public class Servicio {
    
    private int codigo;
    private String descripcion;
    private double precio;
    private String fecha;
    private boolean completado;
    private Vehiculo vehiculo;
    private Mecanico mecanico;
    private String nombre;
    private int duracionEstimada; // En minutos
    private boolean estado;

    public Servicio(int codigo, String descripcion, double precio, String fecha, boolean completado, Vehiculo vehiculo, Mecanico mecanico, String nombre, int duracionEstimada, boolean estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
        this.completado = completado;
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
        this.nombre = nombre;
        this.duracionEstimada = duracionEstimada;
        this.estado = estado;
    }


    public String getNombre() {
        return nombre;
    }

    public int getDuracionEstimada() {
        return duracionEstimada;
    }

    public boolean isEstado() {
        return estado;
    }
    

    public Mecanico getMecanico() {
        return mecanico;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
    

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionEstimada(int duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    public void mostrarInformacion() {

    System.out.println("Código: " + codigo);
    System.out.println("Descripción: " + descripcion);
    System.out.println("Precio: " + precio);
    System.out.println("Fecha: " + fecha);
    System.out.println("Completado: " + completado);
    
        if (vehiculo != null) {
        System.out.println("Vehículo: "
                + vehiculo.getMarca() + " "
                + vehiculo.getModelo());
        System.out.println("Placa: " + vehiculo.getPlaca());
    }

    if (mecanico != null) {
        System.out.println("Mecánico: " + mecanico.getNombre());
        System.out.println("Especialidad: " + mecanico.getEspecialidad());
    }
}
}
    

