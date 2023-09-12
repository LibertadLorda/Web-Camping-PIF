package com.example.proyecto.repositories;

import com.example.proyecto.models.newsletterModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface newsletterRepository extends JpaRepository<newsletterModel, Integer> {
    newsletterModel save(newsletterModel newNewsletter);

}
