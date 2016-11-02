/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.ClienteDao;
import py.edu.facitec.mec.dao.ClienteDaoImpl;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author migueee
 */
public class ClienteControllerImpl  implements ClienteController{
    private ClienteDao clienteDao;
    
    public ClienteControllerImpl() {
        this.clienteDao=new ClienteDaoImpl();
        
    }
    
    @Override
    public void registrarCliente(Cliente cliente) {
        clienteDao.GuardarCliente(cliente);
    }

    @Override
    public void ModificarCliente(Cliente cliente) {
        clienteDao.modificarCliente(cliente);
    }

    @Override
    public void EliminarCliente(int codigo) {
        clienteDao.eliminarCliente(codigo);
    }

    @Override
    public Cliente consultarClientePorCodigo(int codigo) {
       return clienteDao.buscarClientePorCodigo(codigo);
    }

    @Override
    public List<Cliente> consultarClientePorFiltros(String filtro) {
        return clienteDao.buscClientesPorFiltro(filtro);
    }
    
    
}
