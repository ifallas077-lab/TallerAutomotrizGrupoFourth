
package modelo;

public class Usuario {

    private int id;
    private String nombreUsuario;
    private String contrasenaHash;
    private String rol;
    private boolean activo;

    public Usuario(int id, String nombreUsuario, String contrasenaHash, String rol, boolean activo) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasenaHash = contrasenaHash;
        this.rol = rol;
        this.activo = activo;
    }
  
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasenaHash() {
        return contrasenaHash;
    }

    public String getRol() {
        return rol;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasenaHash(String contrasenaHash) {
        this.contrasenaHash = contrasenaHash;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}