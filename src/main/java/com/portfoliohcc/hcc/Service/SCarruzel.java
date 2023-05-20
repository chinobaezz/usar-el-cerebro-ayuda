/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Service;

import com.portfoliohcc.hcc.Entity.Carruzel;
import com.portfoliohcc.hcc.Repository.RCarruzel;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SCarruzel {
    @Autowired
    public RCarruzel carruRepo;
    
    public List<Carruzel> verCarruzel() {
        List<Carruzel> listaCarruzel= carruRepo.findAll();
        return listaCarruzel;
    }

    public Carruzel buscarCarruzel(int id) {
          Carruzel carru = carruRepo.findById(id).orElse(null);
        return carru;
    }

    public void crearCarruzel(Carruzel pers) {
     carruRepo.save(pers);
    }
    

     public void borrarCarruzel(int id){
        carruRepo.deleteById(id);
    }

    public void editarCarruzel(Carruzel pers) {
      carruRepo.save(pers);
    }

    public void deleteEstud(long id) {
        }
   
}
