/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.GregorianCalendar;

/**
 *
 * @author client
 */
public class Promo {
    private Integer id;
    private GregorianCalendar dateDebut;
    private GregorianCalendar dateFin;
    private float prctReduc;
    
    public Promo () {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GregorianCalendar getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(GregorianCalendar dateDebut) {
        this.dateDebut = dateDebut;
    }

    public GregorianCalendar getDateFin() {
        return dateFin;
    }

    public void setDateFin(GregorianCalendar dateFin) {
        this.dateFin = dateFin;
    }

    public float getPrctReduc() {
        return prctReduc;
    }

    public void setPrctReduc(float prctReduc) {
        this.prctReduc = prctReduc;
    }
    
}
