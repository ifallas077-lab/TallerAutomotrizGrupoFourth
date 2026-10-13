/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Isaac Fallas
 */
public class Conexion {

    private static final String URL = "jdbc:sqlite:taller.db";

    public static Connection get() throws SQLException {
        Connection con = DriverManager.getConnection(URL);
        try (Statement st = con.createStatement()) {
            st.execute("Pragma foreign_Keys = ON"); // SQlite no revisa llaves foraneas por defecto
        }
        return con;
    }

    //// Provisional: el role 3 Entrega script SQL
    public static void crearTablas() {
        String sqlClientes = """
                            
        CREATE TABLE IF NOT EXISTS clientes (
                cedula TEXT PRIMARY KEY,
                nombre TEXT NOT NULL,
                telefono TEXT,
                correo TEXT,
                direccion TEXT,
                fecha de registro TEXT,
                estado INTEGER NOT NULL DEFAULT 1)""";
        try (Connection con = get(); Statement st = con.createStatement()) {
            st.execute(sqlClientes);
        } catch (SQLException e) {
            throw new RuntimeException("No se pudo crear la base de datos", e);
        }

    }
}
