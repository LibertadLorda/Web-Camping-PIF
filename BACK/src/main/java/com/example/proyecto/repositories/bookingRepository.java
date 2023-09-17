package com.example.proyecto.repositories;

import com.example.proyecto.models.bookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookingRepository  extends JpaRepository<bookingModel, Integer> {
    bookingModel save(bookingModel newBooking);


    bookingModel findByEmail(String email);

}
