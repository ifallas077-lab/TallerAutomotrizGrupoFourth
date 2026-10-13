package modelo;


public class Vehiculo {
    
  private String placa;
  private String marca;
  private String modelo;
  private int anio;
  private double kilometraje;
  private String tipo;
  private boolean estado;
  private Cliente propietario;

       public Vehiculo() {
    }
    public Vehiculo(String placa, String marca, String modelo, int anio, double kilometraje, String tipo, boolean estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.tipo = tipo;
        this.estado = estado;
        
    
        
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public void mostrarInformacion() {

        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Kilometraje: " + kilometraje);
        System.out.println("Tipo: " + tipo);
        System.out.println("Estado: " + estado);

        if (propietario != null) {
            System.out.println("Propietario: " + propietario.getNombre());
        } else {
            System.out.println("Vehículo sin propietario asignado");
        }
    }
}