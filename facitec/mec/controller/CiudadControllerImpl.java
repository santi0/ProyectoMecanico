/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.controller;

import java.util.List;
import py.edu.facitec.mec.dao.CiudadDao;
import py.edu.facitec.mec.dao.CiudadDaoImpl;
import py.edu.facitec.mec.model.Ciudad;
import py.edu.facitec.mec.model.Cliente;

/**
 *
 * @author CITIC
 */
public class CiudadControllerImpl implements CiudadController{
    private CiudadDao ciudadDao;
    
     public CiudadControllerImpl() {
       
            this.ciudadDao = new CiudadDaoImpl() ;
    }

    @Override
    public void registrarCiudad(Ciudad ciudad) {
         ciudadDao.GuardarCiudad(ciudad);
    }

    @Override
    public void ModificarCiudad(Ciudad ciudad) {
       ciudadDao.modificarCiudad(ciudad);
    }

    @Override
    public void EliminarCiudad(int codigo) {
               ciudadDao.eliminarCiudad(codigo);

    }

    @Override
    public Ciudad consultarCiudadPorCodigo(int codigo) {
         return ciudadDao.buscarCiudadPorCodigo(codigo);
        
    }

    @Override
    public List<Ciudad> consultarCiudadPorFiltros(String filtro) {

    return ciudadDao.buscCiudadPorFiltro(filtro);       
    }
     

    
    
    
}
