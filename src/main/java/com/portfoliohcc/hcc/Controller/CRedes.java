/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Controller;

import com.portfoliohcc.hcc.Entity.Redes;
import com.portfoliohcc.hcc.Service.SRedes;
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
@RequestMapping("redes")
@CrossOrigin("*")
//@CrossOrigin(origins= "https://portafolioback-fqb8.onrender.com")
public class CRedes {
    
    @Autowired
   private SRedes redServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Redes> verRedes(){
        return redServ.verRedes();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Redes verRedes(@PathVariable int id){
        return redServ.buscarRedes(id);
    }
    
    @PostMapping("/create")
    public String agregarRedes (@RequestBody Redes pers){
        redServ.crearRedes(pers);
        return "la redna fue creada correctamente";
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarRedes(@PathVariable long id){
        redServ.borrarRedes((int) id);
    }
    @PutMapping("/editar")
    public void updateRedes(@RequestBody Redes pers){
        redServ.editarRedes(pers);
        
    }
}
