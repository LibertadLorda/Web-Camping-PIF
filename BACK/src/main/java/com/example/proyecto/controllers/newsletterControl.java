package com.example.proyecto.controllers;

import com.example.proyecto.models.modelsNewsletter;
import com.example.proyecto.services.servicesNewsletter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/camping")
@CrossOrigin(origins = "*")
public class controllersNewsletter {

        @Autowired
        servicesNewsletter myNewsletter;

        @GetMapping
        public List<modelsNewsletter> setNewsletter(modelsNewsletter newNewsletter) {

            return (List<modelsNewsletter>) myNewsletter.setNewsletter(newNewsletter);
        }
    }

