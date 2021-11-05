/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Gonzalo
 */
@Entity
public class libro implements Serializable {
    @Basic
    private Long ISBN;
    private String Nombre;
    private Integer ejemplares;
    private Integer ejemplaresprestados;
    private Integer ejemplaresRestantes;
    private Boolean alta;
    private Integer anio;
    @OneToOne
    private autor a;
    @OneToOne
    private editorial e;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public autor getA() {
        return a;
    }

    public void setA(autor a) {
        this.a = a;
    }

    public editorial getE() {
        return e;
    }

    public void setE(editorial e) {
        this.e = e;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresprestados() {
        return ejemplaresprestados;
    }

    public void setEjemplaresprestados(Integer ejemplaresprestados) {
        this.ejemplaresprestados = ejemplaresprestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public libro(Long id, Long ISBN, String Nombre, autor a, editorial e, Integer anio, Integer ejemplares, Integer ejemplaresprestados, Integer ejemplaresRestantes, Boolean alta) {
        this.id = id;
        this.ISBN = ISBN;
        this.Nombre = Nombre;
        this.a = a;
        this.e = e;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.ejemplaresprestados = ejemplaresprestados;
        this.ejemplaresRestantes = ejemplaresRestantes;
        this.alta = alta;
    }

    public libro() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
 
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof libro)) {
            return false;
        }
        libro other = (libro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "libreria.entidades.libro[ id=" + id + " ]";
    }
    
}
