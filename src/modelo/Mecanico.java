
package modelo;

public class Mecanico {

    private String cedula;
    private String nombre;
    private String especialidad;
    private String telefono;
    private String correo;
    private boolean estado;

    public Mecanico() {
    }

    public Mecanico(String cedula, String nombre, String especialidad,
            String telefono, String correo, boolean estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void mostrarInformacion() {

        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("Estado: " + (estado ? "Activo" : "Inactivo"));
    }
}
