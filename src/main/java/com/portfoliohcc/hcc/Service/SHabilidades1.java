/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Service;

import com.portfoliohcc.hcc.Entity.Habilidades1;
import com.portfoliohcc.hcc.Repository.RHabilidades1;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author baeza
 */
    
@Service
@Transactional
public class SHabilidades1 {
   @Autowired
    public RHabilidades1 habiRepo;
     
      public List<Habilidades1> verHabilidades1(){
        List<Habilidades1> listaHabilidades1= habiRepo.findAll();
        return listaHabilidades1;
    }
    
      public Habilidades1 buscarHabilidades1(int id){
        Habilidades1 habi = habiRepo.findById(id).orElse(null);
        return habi;
    }
    
    public void crearHabilidades1(Habilidades1 habi){
        habiRepo.save(habi);
    }
    
    
    
     public void editarhabilidades(Habilidades1 habi){
        habiRepo.save(habi);
    }

    public void borrarHabilidades1(int id) {
    habiRepo.deleteById(id);
    }

    public void editarHablidades1(Habilidades1 hab) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
