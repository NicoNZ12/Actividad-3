
package interfaces;

import cambioAceite.Auto;
import dao.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAOAutoImplementacion implements DAOAuto {
    Main main = new Main();

    //Constructor
    public DAOAutoImplementacion() {
        
    }
    
    //Método registrar
    @Override
    public void agregar(Auto auto){
        try {
            Connection conectar = main.establecerConexion();
            PreparedStatement insertar = conectar.prepareStatement("INSERT INTO cambioAceite(patente, auto,aceite,filtroAceite, filtroAire, filtroCombustible) VALUES (?,?,?,?,?,?)");
            
            insertar.setString(1, auto.getPatente());
            insertar.setString(2, auto.getAuto());
            insertar.setString(3, auto.getAceite());
            insertar.setBoolean(4, auto.isFiltroAceite());
            insertar.setBoolean(5, auto.isFiltroAire());
            insertar.setBoolean(6, auto.isFiltroCombustible());
            insertar.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void actualizar(Auto auto) {
        try {
            Connection conectar = main.establecerConexion();
            PreparedStatement modificar = conectar.prepareStatement("UPDATE cambioAceite SET filtroAceite = ?, filtroAire = ?, filtroCombustible = ? WHERE patente = ?");
            
            modificar.setBoolean(1, auto.isFiltroAceite());
            modificar.setBoolean(2, auto.isFiltroAire());
            modificar.setBoolean(3, auto.isFiltroCombustible());
            modificar.setString(4, auto.getPatente());
            modificar.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void eliminar(Auto auto) {
        try {
            Connection conectar = main.establecerConexion();
            PreparedStatement eliminar = conectar.prepareStatement("DELETE FROM cambioAceite WHERE patente = ?");
            
            eliminar.setString(1, auto.getPatente());
            eliminar.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void buscar(Auto auto) {
        
    }
}
