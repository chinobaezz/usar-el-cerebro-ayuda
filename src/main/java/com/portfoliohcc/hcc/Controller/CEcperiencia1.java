/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Controller;

import com.portfoliohcc.hcc.Entity.Ecperiencia1;
import com.portfoliohcc.hcc.Service.SEcperiencia1;
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

/**
 *
 * @author baeza
 */

@RestController
@RequestMapping("ecperiencia")
@CrossOrigin(origins= "http://localhost:4200")
public class CEcperiencia1 {
    
    
      @Autowired
   private SEcperiencia1 expeServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Ecperiencia1> verEcperiencia1(){
        return expeServ.verEcperiencia1();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Ecperiencia1 verEcperiencia1(@PathVariable int id){
        return expeServ.buscarEcperiencia1(id);
    }
    
    @PostMapping("/create")
    public String agregarEcperiencia1 (@RequestBody Ecperiencia1 pers){
        expeServ.crearecperiencia(pers);
        return "la experiencia fue creada correctamente";
    }
    
   
   
    @DeleteMapping("/delete/{id}")
    public void borrarEcperiencia1(@PathVariable long id){
        expeServ.borrarEcperiencia1((int) id);
    }
    @PutMapping("/editar")
    public void updateEcperiencia1(@RequestBody Ecperiencia1 pers){
        expeServ.editarecperiencia(pers);
        
    }
}
