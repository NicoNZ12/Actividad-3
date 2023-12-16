
package cambioAceite;

public class Auto {
    //Atributos
    private String patente;
    private String auto;
    private String aceite;
    private boolean filtroAceite;
    private boolean filtroAire;
    private boolean filtroCombustible;
    
    
    //constructor
    public Auto(){
        
    }
    
    //Getters y Setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public boolean isFiltroAceite() {
        return filtroAceite;
    }

    public void setFiltroAceite(boolean filtroAceite) {
        this.filtroAceite = filtroAceite;
    }

    public boolean isFiltroAire() {
        return filtroAire;
    }

    public void setFiltroAire(boolean filtroAire) {
        this.filtroAire = filtroAire;
    }

    public boolean isFiltroCombustible() {
        return filtroCombustible;
    }

    public void setFiltroCombustible(boolean filtroCombustible) {
        this.filtroCombustible = filtroCombustible;
    }
    
}
