/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.model.Ciudad;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author CITIC
 */
public interface CiudadController {
    void registrarCiudad(Ciudad ciudad);
    void ModificarCiudad(Ciudad ciudad);
    void EliminarCiudad(int codigo );
    Cliente consultarCiudadPorCodigo(int codigo);
    List<Cliente> consultarCiudadPorFiltros(String filtro);
    
}
