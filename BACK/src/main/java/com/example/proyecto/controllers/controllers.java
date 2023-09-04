package com.example.proyecto.controllers;

import com.example.proyecto.models.models;
import com.example.proyecto.services.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/camping")
@CrossOrigin(origins = "*")
public class controllers {

    @Autowired
    services myCamp;

    @GetMapping
    public List<models> getProducts(){

        return myCamp.getProducts();
    }



}
