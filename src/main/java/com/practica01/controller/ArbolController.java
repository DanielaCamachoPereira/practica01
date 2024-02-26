package com.practica01.controller;

import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/arbol")
public class ArbolController {
  
    @Autowired
    private ArbolService arbolService;
    
    @GetMapping("/listado")
    private String listado(Model model) {
        var arboles = arbolService.getArboles(false);
        model.addAttribute("Arboles", arboles);
        model.addAttribute("totalArboles",arboles.size());
        return "/arbol/listado";
    }
    
     @GetMapping("/nuevo")
    public String arbolNuevo(Arbol arbol) {
        return "/arbol/modifica";
    }
    
    @GetMapping("/eliminar/{idArbol}")
    public String arbolEliminar(Arbol arbol) {
       arbolService.delete(arbol);
        return "redirect:/arbol/listado";
    }
    
    @GetMapping("/modificar/{idArbol}")
    public String categoriaModificar(Arbol arbol, Model model) {
        arbol = arbolService.getArbol(arbol);
        model.addAttribute("arbol", arbol);
        return "/arbol/modifica";
    }

}
