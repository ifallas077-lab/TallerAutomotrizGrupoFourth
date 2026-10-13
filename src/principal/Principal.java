package principal;

import modelo.Cliente;
import modelo.Vehiculo;
import modelo.Mecanico;
import modelo.Servicio;
import modelo.Usuario;
import modelo.Repuesto;
import modelo.Citas;
import modelo.OrdenServicio;
import modelo.Pago;

public class Principal {

    public static void main(String[] args) {

        // CLIENTES
        Cliente cliente1 = new Cliente(
                "123456789",
                "Christopher Mora",
                "116610804",
                "mora@gmail.com",
                "Jacó",
                "24/09/2026",
                true
        );

        Cliente cliente2 = new Cliente(
                "11661115",
                "Maria",
                "60595959",
                "mari@gmail.com",
                "Quebrada Ganado",
                "24/09/2026",
                true
        );

        Cliente[] listaClientes = new Cliente[2];
        listaClientes[0] = cliente1;
        listaClientes[1] = cliente2;

        // VEHÍCULOS
        Vehiculo vehiculo1 = new Vehiculo(
                "ABC123",
                "Toyota",
                "Yaris",
                2011,
                150000,
                "Sedan",
                true
        );

        Vehiculo vehiculo2 = new Vehiculo(
                "OLA506",
                "Honda",
                "Civic",
                2015,
                120000,
                "Sedan",
                true
        );

        vehiculo1.setPropietario(cliente1);
        vehiculo2.setPropietario(cliente2);

        Vehiculo[] listaVehiculos = new Vehiculo[2];
        listaVehiculos[0] = vehiculo1;
        listaVehiculos[1] = vehiculo2;

        // MECÁNICOS
        Mecanico mecanico1 = new Mecanico(
                1,
                "Carlos",
                "Mecanica General",
                "116610808",
                "carlos@gmail.com",
                true
        );

        Mecanico mecanico2 = new Mecanico(
                2,
                "Miguel",
                "Sistema de frenos",
                "88887777",
                "miguel@gmail.com",
                true
        );

        Mecanico[] listaMecanicos = new Mecanico[2];
        listaMecanicos[0] = mecanico1;
        listaMecanicos[1] = mecanico2;

        // SERVICIOS
        Servicio servicio1 = new Servicio(
                1,
                "Cambio de aceite y filtro",
                25000,
                "23/09/2026",
                false,
                vehiculo1,
                mecanico1,
                "Cambio de aceite",
                60,
                true
        );

        Servicio servicio2 = new Servicio(
                2,
                "Cambio de pastillas de freno",
                45000,
                "24/09/2026",
                false,
                vehiculo2,
                mecanico2,
                "Cambio de frenos",
                120,
                true
        );

        Servicio[] listaServicios = new Servicio[2];
        listaServicios[0] = servicio1;
        listaServicios[1] = servicio2;

        // USUARIOS
        Usuario usuario1 = new Usuario(
                1,
                "admin",
                "",
                "ADMIN",
                true
        );

        Usuario usuario2 = new Usuario(
                2,
                "operador",
                "",
                "OPERATIVO",
                true
        );

        Usuario[] listaUsuarios = new Usuario[2];
        listaUsuarios[0] = usuario1;
        listaUsuarios[1] = usuario2;

        // REPUESTOS
        Repuesto repuesto1 = new Repuesto(
                101,
                "Filtro de aceite",
                "Filtro para Toyota Yaris",
                6500,
                10,
                true
        );

        Repuesto repuesto2 = new Repuesto(
                102,
                "Pastillas de freno",
                "Pastillas para Honda Civic",
                18000,
                8,
                true
        );

        Repuesto[] listaRepuestos = new Repuesto[2];
        listaRepuestos[0] = repuesto1;
        listaRepuestos[1] = repuesto2;

        // CITAS
        Citas cita1 = new Citas(
                1,
                "28/09/2026",
                "09:00",
                "Cambio de aceite",
                "PENDIENTE",
                cliente1,
                vehiculo1,
                usuario1
        );

        Citas cita2 = new Citas(
                2,
                "29/09/2026",
                "10:30",
                "Revisión de frenos",
                "PENDIENTE",
                cliente2,
                vehiculo2,
                usuario2
        );

        Citas[] listaCitas = new Citas[2];
        listaCitas[0] = cita1;
        listaCitas[1] = cita2;

        // ÓRDENES DE SERVICIO
        OrdenServicio orden1 = new OrdenServicio(
                1,
                cliente1,
                vehiculo1,
                mecanico1,
                "24/09/2026",
                "Cambio de aceite y filtro",
                "PENDIENTE",
                0
        );

        orden1.agregarServicio(servicio1);
        orden1.agregarRepuesto(repuesto1);

        OrdenServicio orden2 = new OrdenServicio(
                2,
                cliente2,
                vehiculo2,
                mecanico2,
                "24/09/2026",
                "Revisión del sistema de frenos",
                "PENDIENTE",
                0
        );

        orden2.agregarServicio(servicio2);
        orden2.agregarRepuesto(repuesto2);

        OrdenServicio[] listaOrdenes = new OrdenServicio[2];
        listaOrdenes[0] = orden1;
        listaOrdenes[1] = orden2;

        // PAGOS
        Pago pago1 = new Pago(
                1,
                orden1,
                "24/09/2026",
                orden1.getTotal(),
                "SINPE Movil",
                usuario1
        );

        Pago pago2 = new Pago(
                2,
                orden2,
                "24/09/2026",
                orden2.getTotal(),
                "Efectivo",
                usuario2
        );

        Pago[] listaPagos = new Pago[2];
        listaPagos[0] = pago1;
        listaPagos[1] = pago2;

        // MOSTRAR CLIENTES
        for (int i = 0; i < listaClientes.length; i++) {
            System.out.println("==============================");
            System.out.println("CLIENTE " + (i + 1));
            listaClientes[i].mostrarInformacion();
        }

        // MOSTRAR VEHÍCULOS
        for (int i = 0; i < listaVehiculos.length; i++) {
            System.out.println("==============================");
            System.out.println("VEHÍCULO " + (i + 1));
            listaVehiculos[i].mostrarInformacion();
        }

        // MOSTRAR MECÁNICOS
        for (int i = 0; i < listaMecanicos.length; i++) {
            System.out.println("==============================");
            System.out.println("MECÁNICO " + (i + 1));
            listaMecanicos[i].mostrarInformacion();
        }
    }
}
