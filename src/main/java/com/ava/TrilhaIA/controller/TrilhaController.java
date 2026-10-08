package com.ava.TrilhaIA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ava.TrilhaIA.model.TrilhaModel;
import com.ava.TrilhaIA.repository.TrilhaRepository;

@Controller
@RequestMapping("/trilha")
public class TrilhaController {

    @Autowired
    private TrilhaRepository repository;

    
    @GetMapping("/cadastrar")
    public String formTrilha() {
        return "trilha_forms"; 
    }
    
    
    @PostMapping("/salvar")
    public String salvarTrilha(TrilhaModel trilha) {
        repository.save(trilha); 
        return "redirect:/trilha/listar";
    }
    
    
    @GetMapping("/listar")
    public String listarTrilhas(Model model) {
        
        model.addAttribute("trilhas", repository.findAll());
        return "trilha_listar"; 
    }
}