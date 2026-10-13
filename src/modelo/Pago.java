
package modelo;

public class Pago {

    private int codigo;
    private OrdenServicio orden;
    private String fecha;
    private double monto;
    private String metodoPago;
    private Usuario usuarioRegistro;

    public Pago(int codigo, OrdenServicio orden, String fecha, double monto, String metodoPago, Usuario usuarioRegistro) {
        this.codigo = codigo;
        this.orden = orden;
        this.fecha = fecha;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.usuarioRegistro = usuarioRegistro;
    }



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public OrdenServicio getOrden() {
        return orden;
    }

    public void setOrden(OrdenServicio orden) {
        this.orden = orden;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Usuario getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(Usuario usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }


    public void mostrarInformacion() {

        System.out.println("Código del pago: " + codigo);

        System.out.println("Orden de servicio: "
                + orden.getCodigo());

        System.out.println("Cliente: "
                + orden.getCliente().getNombre());

        System.out.println("Fecha: " + fecha);

        System.out.println("Monto: ₡" + monto);

        System.out.println("Método de pago: " + metodoPago);

        System.out.println("Registrado por: "
                + usuarioRegistro.getNombreUsuario());
    }
}