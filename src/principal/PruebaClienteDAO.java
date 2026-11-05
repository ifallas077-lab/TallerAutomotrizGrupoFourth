/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import dao.ClienteDAO;
import dao.Conexion;
import modelo.Cliente;

/**
 *
 * @author Isaac Fallas
 */
public class PruebaClienteDAO {

    public static void main (String[] args) {
        Conexion.crearTablas();
        ClienteDAO dao = new ClienteDAO();

        //1- GUARDAR 
        //dao.guardar(new Cliente("1-1111-1111", "Ana Mora", "88881111",
                //"ana@mail.com", "San Jose", "13/10/2026", true));

        //2- ACTUALIZAR
        //dao.actualizar(new Cliente("1-1111-1111", "Ana Mora Solano", "777777777",
        //"ana.nueva@mail.com", "Heredia", "13/10/2026", true));
        // 3- BUSCAR
        Cliente c = dao.buscar("1-1111-1111");
        System.out.println(c == null ? "No existe" : "Encontrado: " + c.getNombre());
        // 4- ELIMINAR 
        //dao.eliminar("1-1111-1111");
        System.out.println("=== Clientes en la base de datos ===");
        for (Cliente cliente : dao.listar()) {
            cliente.mostrarInformacion();
            System.out.println("----------------------------------");
        }
    }

}
