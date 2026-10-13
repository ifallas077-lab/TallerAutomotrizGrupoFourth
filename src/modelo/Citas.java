
package modelo;


public class Citas {
    
    
      private int codigo;
    private String fecha;
    private String hora;
    private String motivo;
    private String estado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Usuario usuarioRegistro;

    public Citas(int codigo, String fecha, String hora, String motivo, String estado, Cliente cliente, Vehiculo vehiculo, Usuario usuarioRegistro) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.usuarioRegistro = usuarioRegistro;
    }
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public Usuario getUsuarioRegistro() {
        return usuarioRegistro;
    }
    
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getEstado() {
        return estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setUsuarioRegistro(Usuario usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    
    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    
}
