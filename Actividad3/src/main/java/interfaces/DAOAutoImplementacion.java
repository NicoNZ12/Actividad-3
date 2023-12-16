
package interfaces;

import cambioAceite.Auto;
import dao.Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    public boolean buscar(Auto auto) {
        try {
            Connection conectar = main.establecerConexion();
            PreparedStatement buscar = conectar.prepareStatement("SELECT * FROM cambioAceite WHERE patente = ?");

            buscar.setString(1, auto.getPatente());

            ResultSet consulta = buscar.executeQuery();

            if (consulta.next()) {
                auto.setPatente(consulta.getString("patente"));
                auto.setAuto(consulta.getString("auto"));
                auto.setAceite(consulta.getString("aceite"));
                auto.setFiltroAceite(consulta.getBoolean("filtroAceite"));
                auto.setFiltroAire(consulta.getBoolean("filtroAire"));
                auto.setFiltroCombustible(consulta.getBoolean("filtroCombustible"));
                return true;
            } else {
                return false; // Devuelve false si no se encuentra el registro
            }

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
