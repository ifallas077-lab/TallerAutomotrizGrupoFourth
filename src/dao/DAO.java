/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;

/**
 *
 * @author Isaac Fallas
 */
public interface DAO<T, K> {     // T: la entidad (cliente) K: el tipo de su llave (String)      
    List<T> listar();
    T buscar(K clave);
    void guardar(T objeto);
    void actualizar (T objeto);
    void eliminar(K clave);

}
