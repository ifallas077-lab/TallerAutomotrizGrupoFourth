package modelo;

public class OrdenServicio {

    private int codigo;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Mecanico mecanico;
    private String fechaRecepcion;
    private String observaciones;
    private String estado;
    private double total;

    // Cambiamos los ArrayList por arreglos tradicionales de tamaño fijo (ej. máximo 10)
    private Servicio[] servicios = new Servicio[10];
    private Repuesto[] repuestos = new Repuesto[10];
    
    // Llevamos la cuenta de cuántos elementos reales se han agregado
    private int contadorServicios = 0;
    private int contadorRepuestos = 0;

    public OrdenServicio(int codigo, Cliente cliente, Vehiculo vehiculo, Mecanico mecanico, String fechaRecepcion, String observaciones, String estado, double total) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.mecanico = mecanico;
        this.fechaRecepcion = fechaRecepcion;
        this.observaciones = observaciones;
        this.estado = estado;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(String fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    // Retorna el arreglo completo de servicios
    public Servicio[] getServicios() {
        return servicios;
    }

    public void setServicios(Servicio[] servicios) {
        this.servicios = servicios;
    }

    // Retorna el arreglo completo de repuestos
    public Repuesto[] getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(Repuesto[] repuestos) {
        this.repuestos = repuestos;
    }

    public void agregarServicio(Servicio servicio) {
        if (servicio != null && contadorServicios < servicios.length) {
            servicios[contadorServicios] = servicio;
            contadorServicios++; // Avanzamos la posición del índice
            calcularTotal();
        }
    }

    public void agregarRepuesto(Repuesto repuesto) {
        // Validamos que no sea nulo y que quepa en el arreglo
        if (repuesto != null && contadorRepuestos < repuestos.length) {
            repuestos[contadorRepuestos] = repuesto;
            contadorRepuestos++; // Avanzamos la posición del índice
            calcularTotal();
        }
    }

    public void calcularTotal() {
        total = 0;

        for (int i = 0; i < contadorServicios; i++) {
            total += servicios[i].getPrecio();
        }

        for (int i = 0; i < contadorRepuestos; i++) {
            total += repuestos[i].getPrecio();
        }
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Vehículo: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        System.out.println("Mecánico: " + mecanico.getNombre());
        System.out.println("Fecha: " + fechaRecepcion);
        System.out.println("Observaciones: " + observaciones);
        System.out.println("Estado: " + estado);

        System.out.println("SERVICIOS:");
        // Mostramos solo los servicios agregados usando el contador
        for (int i = 0; i < contadorServicios; i++) {
            System.out.println("- " + servicios[i].getNombre() + ": ₡" + servicios[i].getPrecio());
        }

        System.out.println("REPUESTOS:");
        // Mostramos solo los repuestos agregados usando el contador
        for (int i = 0; i < contadorRepuestos; i++) {
            System.out.println("- " + repuestos[i].getNombre() + ": ₡" + repuestos[i].getPrecio());
        }

        System.out.println("TOTAL: ₡" + total);
    }
}
