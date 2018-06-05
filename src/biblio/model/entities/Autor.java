
package biblio.model.entities;

import biblio.Global;

public class Autor {
    
    private String codigo;
    private String nombre;

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String alta() {
        Global g  = new Global();
        this.codigo = g.obtenerCadenaAleatoria(4);
        
        return biblio.Main.adaptador.altaAutor(this);
    }
    
}
