package com.mi.service;

import com.mi.entity.Registration;
import com.mi.repo.RegistrationRepo;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class WorkshopService {

    private final RegistrationRepo repo;
    private int totalSeats =20 ;

    public WorkshopService(RegistrationRepo repo) {
        this.repo = repo;
    }

    public Map<String, Object> register(String name, String email) {
        Map<String, Object> result = new HashMap<>();

        if (totalSeats > 0) {
            Registration reg = new Registration();
            reg.setName(name);
            reg.setEmail(email);
            repo.save(reg);
            totalSeats--;
            result.put("registered", true);
        } else {
            result.put("registered", false);
        }
        return result;
    }

    public int getSeatsLeft() {
        return totalSeats;
    }

    public Map<String, Object> getPriceInfo() {
        Map<String, Object> price = new HashMap<>();
        price.put("price", 999);
        price.put("tier", totalSeats > 0 ? "Available" : "Sold Out");
        return price;
    }
}
