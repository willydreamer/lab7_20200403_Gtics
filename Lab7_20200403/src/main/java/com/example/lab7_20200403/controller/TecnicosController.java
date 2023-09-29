package com.example.lab7_20200403.controller;

import com.example.lab7_20200403.entity.Technician;
import com.example.lab7_20200403.repository.TechnicianRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/tecnicos")
public class TecnicosController {
    final TechnicianRepository technicianRepository;

    public TecnicosController(TechnicianRepository technicianRepository) {
        this.technicianRepository = technicianRepository;
    }

    @GetMapping(value = {"","lista"})
    public String listarSitios (Model model){
        model.addAttribute("listaTecnicos", technicianRepository.findAll());
        return "listaTecnicos";
    };
    @GetMapping("/new")
    public String nuevoProductoFrm(Model model, @ModelAttribute("tecnico") Technician technician) {
        return "editTecnico";
    }

    @GetMapping("/edit")
    public String editarTransportista(@ModelAttribute("tecnico") Technician technician,
                                      Model model, @RequestParam("id") int id) {

        Optional<Technician> tecnico = technicianRepository.findById(id);

        if (tecnico.isPresent()) {
            technician = tecnico.get();
            model.addAttribute("tecnico", technician);
            return "editTecnico";
        } else {
            return "redirect:/lista";
        }
    }

}
