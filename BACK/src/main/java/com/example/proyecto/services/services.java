package com.example.proyecto.services;

import com.example.proyecto.models.models;
import com.example.proyecto.repositories.repositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class services {

    @Autowired
    repositories myCamp;

    public List<models> getProducts() {

        return (List<models>)myCamp.findAll();
        }


    public String deleteProduct(int id) {
        try{
            myCamp.deleteById(id);
            return "Record "+id+" was successfully deleted.";
        }
        catch(Exception e){
            return "Unable to delete record: \n"+e.getMessage();
        }
    }

    public models setProduct(models newProduct) {
        try{
            return myCamp.save(newProduct);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public models changeProduct(int id, models newProduct) {
        try{
            models toUpdateProduct= myCamp.findById(id).get();
            toUpdateProduct.setTypeFee(newProduct.getTypeFee());

            return toUpdateProduct;

        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
