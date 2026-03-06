package com.demo.demo.controller;

import com.demo.demo.model.Restuarent;
import com.demo.demo.service.RestuarentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestuarentController {

    @Autowired
    private RestuarentService restuarentService;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listRestuarents", restuarentService.getAllRestuarent());
        return "index"; // => templates/index.html
    }

    @GetMapping("/new")
    public String showNewForm(Model model){
        model.addAttribute("restuarent", new Restuarent());
        return "new_restuarent"; // => templates/new_restuarent.html
    }

    @PostMapping("/save")
    public String saveRestuarent(@ModelAttribute("restuarent") Restuarent restuarent){
        restuarentService.saveRestuarent(restuarent);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model){
        model.addAttribute("restuarent", restuarentService.getRestuarentById(id));
        return "edit"; // => templates/edit.html
    }

    @GetMapping("/delete/{id}")
    public String deleteRestuarent(@PathVariable Integer id){
        restuarentService.deleteRestuarentById(id);
        return "redirect:/";
    }
}