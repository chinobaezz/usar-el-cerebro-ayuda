/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Controller;

import com.portfoliohcc.hcc.Entity.Carruzel;
import com.portfoliohcc.hcc.Service.SCarruzel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carruzel")
//@CrossOrigin("*")
@CrossOrigin(origins= "https://chino-frontend.web.app")
public class CCarruzel {
 @Autowired
   private SCarruzel carruServ;
    @GetMapping("/lista")
    @ResponseBody
    public List <Carruzel> verCarruzel(){
        return carruServ.verCarruzel();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Carruzel verCarruzel(@PathVariable int id){
        return carruServ.buscarCarruzel(id);
    }
    
    @PostMapping("/create")
    public String agregarCarruzel (@RequestBody Carruzel pers){
        carruServ.crearCarruzel(pers);
        return "la carruio fue creada correctamente";
    }

  
    
    @DeleteMapping("/delete/{id}")
    public void borrarCarruzel(@PathVariable long id){
        carruServ.borrarCarruzel((int) id);
    }

    @PutMapping("/editar")
    public void updateCarruzel(@RequestBody Carruzel pers){
        carruServ.editarCarruzel(pers);
        
    }   
}
