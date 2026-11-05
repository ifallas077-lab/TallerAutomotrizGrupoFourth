/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Isaac Fallas
 */// Acceso a datos de la table clientes. La llave es la cedula (String).
public class ClienteDAO implements DAO<Cliente, String> {

    @Override
    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM clientes ORDER BY nombre";
        try (Connection con = Conexion.get(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("No se pudieron listar los cliente", e);
        }
        return lista;
    }

    @Override
    public Cliente buscar(String cedula) {
        String sql = "SELECT * FROM clientes WHERE cedula = ?";
        try (Connection con = Conexion.get(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cedula);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return mapear(rs);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("No se pudo buscar el cliente", e);
        }
        return null; //no existe
    }

    // Indica si ya hay un cliente con esa cedula
    public boolean existe(String cedula) {
        return buscar(cedula) != null;
    }

    @Override
    public void guardar(Cliente c) {
        String sql = "INSERT INTO clientes (cedula, nombre, telefono, correo, direccion, fecha_registro, estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexion.get(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getCedula());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getTelefono());
            ps.setString(4, c.getCorreo());
            ps.setString(5, c.getDireccion());
            ps.setString(6, c.getFechaRegistro());
            ps.setInt(7, c.isEstado() ? 1 : 0);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("No se pudo guardar el cliente", e);
        }
    }

    @Override
    public void actualizar(Cliente c) {
        String sql = "UPDATE clientes SET nombre=?, telefono=?, correo=?, direccion=?,"
                + "fecha_registro=?, estado=? WHERE cedula =?";
        try (Connection con = Conexion.get(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getTelefono());
            ps.setString(3, c.getCorreo());
            ps.setString(4, c.getDireccion());
            ps.setString(5, c.getFechaRegistro());
            ps.setInt(6, c.isEstado() ? 1 : 0);
            ps.setString(7, c.getCedula());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("No se pudo actualizar el cliente", e);
        }
    }

    @Override
    public void eliminar(String cedula) {
        String sql = "DELETE FROM clientes WHERE cedula = ?";
        try (Connection con = Conexion.get(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, cedula);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("No se pudo liminar el cliente", e);
        }
    }

    // Convierte una fila de la table en un objeto Cliente
    private Cliente mapear(ResultSet rs) throws SQLException {
        return new Cliente(
                rs.getString("cedula"),
                rs.getString("nombre"),
                rs.getString("telefono"),
                rs.getString("correo"),
                rs.getString("direccion"),
                rs.getString("fecha_registro"),
                rs.getInt("estado") == 1);
    }

}
