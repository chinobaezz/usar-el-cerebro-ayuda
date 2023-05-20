/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Service;

import com.portfoliohcc.hcc.Entity.Redes;
import com.portfoliohcc.hcc.Repository.RRedes;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SRedes {
    
    @Autowired
    public RRedes redRepo;
    public List<Redes> verRedes() {
        List<Redes> listaRedes= redRepo.findAll();
        return listaRedes;
    }
    
    public Redes buscarRedes(int id) {
          Redes red = redRepo.findById(id).orElse(null);
        return red;
    }

    public void crearRedes(Redes pers) {
     redRepo.save(pers);
    }
    

     public void borrarRedes(int id){
        redRepo.deleteById(id);
    }

    public void editarRedes(Redes pers) {
      redRepo.save(pers);
    }

    public void deleteEstud(long id) {
        } 
    
    
}
