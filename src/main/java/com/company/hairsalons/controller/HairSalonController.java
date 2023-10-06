package com.company.hairsalons.controller;

import com.company.hairsalons.model.HairSalon;
import com.company.hairsalons.model.Hairdresser;
import com.company.hairsalons.service.HairSalonService;
import com.company.hairsalons.service.HairdresserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@RequestMapping("/salons")
public class HairSalonController {

    private final HairSalonService hairSalonService;
    private final HairdresserService hairdresserService;

    @Autowired
    public HairSalonController(HairSalonService hairSalonService, HairdresserService hairdresserService) {
        this.hairSalonService = hairSalonService;
        this.hairdresserService = hairdresserService;
    }

    @GetMapping
    public String getHairSalons(Model model) {
        Set<HairSalon> hairSalons = hairSalonService.getHairSalons();
        model.addAttribute("salons", hairSalons);
        return "salons";
    }

    @PostMapping
    public String addHairSalon(@RequestBody HairSalon hairSalon) {
        hairSalonService.addHairSalon(hairSalon);
        return "redirect:";
    }

    @GetMapping("/{salon_id}")
    public String getHairSalon(@PathVariable("salon_id") Long salonId, Model model) {
        HairSalon hairSalon = hairSalonService.getHairSalonById(salonId);
        model.addAttribute("salon", hairSalon);
        return "salons";
    }

    @GetMapping("delete/{salon_id}")
    public String deleteHairSalon(@PathVariable("salon_id") long salonId) {
        hairSalonService.deleteHairSalonById(salonId);
        return "redirect:/salons";
    }

    @RequestMapping(value = "/{salon_id}/hairdressers/{hairdresser_id}", method = {RequestMethod.GET, RequestMethod.POST})
    public String assignHairdresserToHairSalon(
            @PathVariable("salon_id") long salonId,
            @PathVariable("hairdresser_id") long hairdresserId) {
        HairSalon hairSalon = hairSalonService.getHairSalonById(salonId);
        Hairdresser hairdresser = hairdresserService.getHairdresserById(hairdresserId);
        if (hairSalon == null) {
            return "redirect:/error?message=Hair salon not found with ID: " + salonId;
        }
        if (hairdresser == null) {
            return "redirect:/error?message=Hairdresser not found with ID: " + hairdresserId;
        }
        hairSalon.addHairdresser(hairdresser);
        hairdresser.setHairSalon(hairSalon);
        hairSalonService.addHairdresserToSalon(hairdresserId, salonId);
        hairdresserService.addHairdresserToSalon(hairSalon, hairdresser);
        return "redirect:/salons/" + salonId;
    }
}
