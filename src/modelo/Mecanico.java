package modelo;

public class Mecanico {
    
  private int id;
    private String nombre;
    private String especialidad;
    private String telefono;  
    private String correo;
    private boolean estado;

    public Mecanico(int id, String nombre, String especialidad, String telefono, String correo, boolean estado) {
        this.id = id;
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
    
    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
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

    System.out.println("ID: " + id);
    System.out.println("Nombre: " + nombre);
    System.out.println("Especialidad: " + especialidad);
    System.out.println("Teléfono: " + telefono);
    System.out.println("Correo: " + correo);
System.out.println("Estado: " + (estado ? "Activo" : "Inactivo"));
} 
    
}
