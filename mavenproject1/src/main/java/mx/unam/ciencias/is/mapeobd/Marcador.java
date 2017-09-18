/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.ciencias.is.mapeobd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Clase que modela un marcador apartir de la tabla marcador
 * @author jonathan
 */
@Entity
@Table(name="marcador")
public class Marcador {
    @Id@GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column(name = "idmarcador")
    private int marcador_id;
    @Column(name = "nombreM")
    private String nombre_m;
    @Column(name = "latitud")
    private double latitud;
    @Column(name = "longitud")
    private double longitud;
    @Column(name = "descripcion")
    private String descripcion;
    //Aqui va tu codigo
    @ManyToOne
    @JoinColumn(name="usuarioId")
    private Usuario user;
    
    
    /**Nos da el id del marcador
     * @return el id del marcador 
    */
    public int getMarcador_id() {
        return marcador_id;
    }
    
    /** Pone el id del marcador.
      @param marcador_id 
    */
    public void setMarcador_id(int marcador_id) {
        this.marcador_id = marcador_id;
    }
    
    /**Nos da el nombre del marcador
     * @return el nombre del marcador
     */
    public String getNombre_m() {
        return nombre_m;
    }

    /**
     * Pone el nombre del marcador
     * @param nombre_m 
     */
    public void setNombre_m(String nombre_m) {
        this.nombre_m = nombre_m;
    }

    /**
     * Nos da la latitud del marcador
     * @return la latitud del marcador
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Pone la latitud del marcador
     * @param latitud
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * Nos da la longitud del marcador
     * @return la longitud del marcador
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Pone la longitud del marcador
     * @param longitud 
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Nos da la descripción del marcador
     * @return La descripción del marcador
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * Pone la descripción del marcador.
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    //Aqui va tu codigo
}
