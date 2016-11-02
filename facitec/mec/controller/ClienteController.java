/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author migueee
 */
public interface ClienteController {
    //definimoslasreglasdelnegocion que es lo  que vaahacer elusuario
    
    void registrarCliente(Cliente cliente);
    void ModificarCliente(Cliente cliente);
    void EliminarCliente(int codigo );
    Cliente consultarClientePorCodigo(int codigo);
    List<Cliente> consultarClientePorFiltros(String filtro);
}
