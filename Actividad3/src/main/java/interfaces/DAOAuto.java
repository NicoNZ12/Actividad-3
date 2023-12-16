
package interfaces;

import cambioAceite.Auto;


public interface DAOAuto {
    public void agregar(Auto auto);
    
    public void actualizar(Auto auto);
    
    public void eliminar(Auto auto);
    
    public boolean buscar(Auto auto);
}
