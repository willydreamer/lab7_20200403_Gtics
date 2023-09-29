package com.example.lab7_20200403.controller;


import com.example.lab7_20200403.repository.EstadisticasRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estadisticas")
public class EstadisticasController {

    final EstadisticasRepository estadisticasRepository;

    public EstadisticasController(EstadisticasRepository estadisticasRepository) {
        this.estadisticasRepository = estadisticasRepository;

    }

    @GetMapping(value = {"","lista"})
    public String listarSitios (Model model){
        model.addAttribute("estadisticas", estadisticasRepository.getEstadisticas());
        return "estadisticas";
    };
}
