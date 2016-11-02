/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;

import java.util.List;
import py.edu.facitec.mec.model.Ciudad;

/**
 *
 * @author CITIC
 */
public interface CiudadDao {
    void GuardarCiudad(Ciudad ciudad);
    void modificarCiudad (Ciudad ciudad);
    void eliminarCiudad (int codigo);
    Ciudad buscarCiudadPorCodigo  (int codigo);
    List<Ciudad> buscCiudadPorFiltro(String filtro);
}
