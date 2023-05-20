/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Service;

import com.portfoliohcc.hcc.Entity.Estudio1;
import com.portfoliohcc.hcc.Repository.REstudio1;
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
public class SEstudio1 {
    
   
 @Autowired
  REstudio1 estuRepo;
 
    public List<Estudio1> verEstudio1() {
        List<Estudio1> listaEstudio1= estuRepo.findAll();
        return listaEstudio1;
    }

    public Estudio1 buscarEstudio1(int id) {
          Estudio1 estu = estuRepo.findById(id).orElse(null);
        return estu;
    }

    public void crearEstudio1(Estudio1 estu) {
     estuRepo.save(estu);
    }
    

     public void borrarEstudio1(int id){
        estuRepo.deleteById(id);
    }

    public void editarEstudio1(Estudio1 pers) {
      estuRepo.save(pers);
    }

    public void deleteEstud(long id) {
    }
}
