package com.example.proyecto.services;

import com.example.proyecto.models.modelsNewsletter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicesNewsletter {
    @Autowired
    servicesNewsletter myNewsletters;


    public modelsNewsletter setNewsletter(modelsNewsletter newNewsletter) {
        try {
            return myNewsletters.setNewsletter(newNewsletter);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}