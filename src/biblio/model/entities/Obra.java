/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblio.model.entities;

import biblio.Global;

/**
 *
 * @author alumno
 */
public class Obra {
    
    private String codigo;
    private String titulo;
    private int anyo;
    private String autor;

    public Obra() {
    }

    public Obra(String titulo, int anyo) {
        this.titulo = titulo;
        this.anyo = anyo;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String alta() {
        Global g  = new Global();
        this.codigo = g.obtenerCadenaAleatoria(4);
        
        return biblio.Main.adaptador.altaObra(this);
    }
    
}
