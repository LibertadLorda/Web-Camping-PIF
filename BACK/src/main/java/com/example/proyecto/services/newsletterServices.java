package com.example.proyecto.services;

import com.example.proyecto.models.newsletterModel;
import com.example.proyecto.repositories.newsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class newsletterServices {
    @Autowired
    private newsletterRepository myNewsletters;


    public List<newsletterModel> getNewsletter() {

        return (List<newsletterModel>)myNewsletters.findAll();
    }

    public newsletterModel saveNewsletter(newsletterModel newNewsletter) {
        try {
            return myNewsletters.save(newNewsletter);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}