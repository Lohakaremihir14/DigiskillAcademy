package com.mi.controller;

import com.mi.service.WorkshopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

@Controller
public class WorkshopController {

    private final WorkshopService service;

    public WorkshopController(WorkshopService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String showHome(Model model, @ModelAttribute("message") String message) {
        model.addAttribute("workshopName", "Digiskill Academy Workshop");
        model.addAttribute("startDate", "Saturday, November 15th, 2025");
        model.addAttribute("duration", "4 Weeks (Sat & Sun)");
        model.addAttribute("time", "7:00 PM - 8:30 PM (IST)");
        model.addAttribute("platform", "Live Online Sessions");
        model.addAttribute("requirements", "A computer with internet. No prior experience needed.");
        model.addAttribute("seatsLeft", service.getSeatsLeft());
        model.addAttribute("priceInfo", service.getPriceInfo());
        model.addAttribute("message", message);
        return "index";
    }

    @PostMapping("/register")
    public String register(@RequestParam String name,
                           @RequestParam String email,
                           RedirectAttributes redirectAttributes) {

        Map<String, Object> result = service.register(name, email);

        if ((boolean) result.get("registered")) {
            redirectAttributes.addFlashAttribute("message", "✅ Registration successful!");
        } else {
            redirectAttributes.addFlashAttribute("message", "⚠️ Workshop full — added to waitlist.");
        }

        return "redirect:/";
    }
}
