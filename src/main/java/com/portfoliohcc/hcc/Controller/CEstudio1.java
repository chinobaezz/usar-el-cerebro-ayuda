/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfoliohcc.hcc.Controller;

import com.portfoliohcc.hcc.Entity.Estudio1;
import com.portfoliohcc.hcc.Service.SEstudio1;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("estudio")
//@CrossOrigin("*")
@CrossOrigin(origins= "https://chino-frontend.web.app")
public class CEstudio1 {
    
     @Autowired
  SEstudio1 estudServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Estudio1> verEstudio1(){
        return estudServ.verEstudio1();
    }
    
    @GetMapping("/lista/saludar")
    public String saludar(){
        return "bienvenido Arg";
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Estudio1 verEstudio1(@PathVariable int id){
        return estudServ.buscarEstudio1(id);
    }
    
    @PostMapping("/create")
    public String agregarEstudio1 (@RequestBody Estudio1 estud){
        estudServ.crearEstudio1(estud);
        return "la estudio fue creada correctamente";
    }

  
    
    @DeleteMapping("/delete/{id}")
    public void borrarEstudio1(@PathVariable long id){
        estudServ.borrarEstudio1((int) id);
    }

    @PutMapping("/editar")
    public void updateEstudio1(@RequestBody Estudio1 pers){
        estudServ.editarEstudio1(pers);
        
    }
    
}
