/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Service;

import com.portfoliohcc.hcc.Entity.Ecperiencia1;
import com.portfoliohcc.hcc.Repository.REcperiencia1;
import com.portfoliohcc.hcc.Repository.REcperiencia1;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

  
@Service
@Transactional
public class SEcperiencia1 {
 
     @Autowired
    public REcperiencia1 ecpeRepo;
    
    public List<Ecperiencia1> verEcperiencia1(){
        List<Ecperiencia1> listaEcperiencia1= ecpeRepo.findAll();
        return listaEcperiencia1;
    }
    
      public Ecperiencia1 buscarEcperiencia1(int id){
        Ecperiencia1 ecpe = ecpeRepo.findById(id).orElse(null);
        return ecpe;
    }
      //donde dice persona poner ecperiencia donde dice perso poner ecpe aaAfgbbn
    public void crearecperiencia(Ecperiencia1 ecpe){
        ecpeRepo.save(ecpe);
    }
    
    
    
     public void editarecperiencia(Ecperiencia1 ecpe){
        ecpeRepo.save(ecpe);
    }

    public void borrarEcperiencia1(int id) {
    ecpeRepo.deleteById(id);
    }
     
}
