package com.company.hairsalons.controller;

import com.company.hairsalons.model.Hairdresser;
import com.company.hairsalons.service.HairdresserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@RequestMapping("/hairdressers")
public class HairdresserController {

    private final HairdresserService hairdresserService;

    public HairdresserController(HairdresserService Hairdresserservice) {
        this.hairdresserService = Hairdresserservice;
    }

    @GetMapping
    public String getAllHairdressers(Model model){
        Set<Hairdresser> hairdressers = hairdresserService.getAllHairdressers();
        model.addAttribute("hairdressers", hairdressers);
        return "hairdressers";
    }

    @PostMapping
    public String addRoom(@RequestBody Hairdresser Hairdresser) {
        hairdresserService.addHairdresser(Hairdresser);
        return "redirect:";
    }

    @GetMapping("/{hairdresser_id}")
    public String getHairdresserById(@PathVariable("hairdresser_id") long hairdresserId, Model model){
        Hairdresser hairdresser = hairdresserService.getHairdresserById(hairdresserId);
        model.addAttribute("Hairdresser", hairdresser);
        return "hairdressers";
    }

    @DeleteMapping("/{hairdresser_id}")
    public String deleteHairdresser(@PathVariable("hairdresser_id") long HairdresserId){
        hairdresserService.removeHairdresser(HairdresserId);
        return "redirect:hairdressers/"+HairdresserId;
    }


}