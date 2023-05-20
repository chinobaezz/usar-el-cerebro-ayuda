/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author baeza
 */
@Entity
public class Habilidades1 {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
      private String habilidades;
    
      private int porcentajes;
      @Lob
      private String classe;
      @Lob
      private String progres;

    public Habilidades1() {
    }

    public Habilidades1(String habilidades, int porcentajes, String classe, String progres) {
        this.habilidades = habilidades;
        this.porcentajes = porcentajes;
        this.classe = classe;
        this.progres = progres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public int getPorcentajes() {
        return porcentajes;
    }

    public void setPorcentajes(int porcentajes) {
        this.porcentajes = porcentajes;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getProgres() {
        return progres;
    }

    public void setProgres(String progres) {
        this.progres = progres;
    }
      

}
