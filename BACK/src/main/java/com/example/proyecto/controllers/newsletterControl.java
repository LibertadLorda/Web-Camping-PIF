package com.example.proyecto.controllers;

import com.example.proyecto.models.newsletterModel;
import com.example.proyecto.repositories.newsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/newsletter")
@CrossOrigin(origins = "*")
public class newsletterControl {

        @Autowired
        private newsletterRepository myNewsletters;

       @GetMapping
       public List<newsletterModel> getNewsletter() {

           return myNewsletters.findAll();
       }

        @PostMapping (path="/add")
        public newsletterModel saveNewsletter(@RequestBody newsletterModel newNewsletter) {

            return myNewsletters.save(newNewsletter);
        }
    }

