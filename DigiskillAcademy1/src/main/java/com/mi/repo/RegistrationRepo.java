package com.mi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mi.entity.Registration;

public interface RegistrationRepo extends JpaRepository<Registration, Integer> {
}
