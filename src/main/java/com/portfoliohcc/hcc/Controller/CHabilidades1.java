/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Controller;

import com.portfoliohcc.hcc.Entity.Habilidades1;
import com.portfoliohcc.hcc.Service.SHabilidades1;
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
@RequestMapping("habilidades")
@CrossOrigin("*")
//@CrossOrigin(origins= "https://portafolioback-fqb8.onrender.com")
public class CHabilidades1 {
 
    @Autowired
   private SHabilidades1 habServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Habilidades1> verHabilidades1(){
        return habServ.verHabilidades1();
    }
     @GetMapping("/ver/{id}")
    @ResponseBody
    public Habilidades1 verHabilidades1(@PathVariable int id){
        return habServ.buscarHabilidades1(id);
    }
    
    @PostMapping("/create")
    public String agregarHabilidades1 (@RequestBody Habilidades1 hab){
        habServ.crearHabilidades1(hab);
        return "hablidad fue creada correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarHabilidades1(@PathVariable long id){
        habServ.borrarHabilidades1((int) id);
    }

    @PutMapping("/editar")
    public void updateHabilidades1(@RequestBody Habilidades1 hab){
        habServ.editarHablidades1(hab);
        
    }
    
    
}
