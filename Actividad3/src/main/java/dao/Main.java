
package dao;

import cambioAceite.GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Main {
    private Connection cnx = null;
    private final String user = "root";
    private final String password = "1234";
    private final String db = "lubricentro";
    private final String ip = "localhost";
    private final String puerto = "3306";
    private final String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;

    public Connection establecerConexion() {
        try {
            cnx = DriverManager.getConnection(cadena, user, password);
            //JOptionPane.showMessageDialog(null, "Conexion establecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion NO establecida" + e);
        }
        return cnx;
    }
    public static void main(String[] args) {
        new Main().establecerConexion();
        new GUI().setVisible(true);
    }
}
