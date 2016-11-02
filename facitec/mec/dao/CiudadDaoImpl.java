/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.facitec.mec.dao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import py.edu.facitec.mec.dao.CiudadDao;
import py.edu.facitec.mec.model.Ciudad;
import py.edu.facitec.mec.util.ConexionManager;
/**
 *
 * @author CITIC
 */
public class CiudadDaoImpl implements  CiudadDao{

    @Override
    public void GuardarCiudad(Ciudad ciudad) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   String sql="insert  into ciudad(nombres,  apellidos,direccion) values "
                + "('"+ciudad.getNombre()+"','"+ciudad.getIso()+"',"
                + "'"+ciudad.getEstado()+"')";
        
        System.out.println(sql);
        //conectara la base de datos
        ConexionManager.conectar();
        try {
            //ejecutar elsql
            ConexionManager.stm.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CiudadDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        //cerrar la conexion con la base de datos
        ConexionManager.desconectar();
         
    
    }

    @Override
    public void modificarCiudad(Ciudad ciudad) {
        
    }

    @Override
    public void eliminarCiudad(int codigo) {
        
    }

    @Override
    public Ciudad buscarCiudadPorCodigo(int codigo) {
        return null;
    }

    @Override
    public List<Ciudad> buscCiudadPorFiltro(String filtro) {
        return null;
    }
        
    
}
