package com.example.proyecto.services;

import com.example.proyecto.models.bookingModel;
import com.example.proyecto.repositories.bookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class bookingServices {

    @Autowired
    private bookingRepository myBookings;

    public List<bookingModel> getBooking() {

        return (List<bookingModel>)myBookings.findAll();
    }

    public bookingModel saveBooking(bookingModel newBooking) {
        try {
            return myBookings.save(newBooking);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public bookingModel updateBooking(String email, bookingModel updatedBooking) {
        bookingModel existingBooking = myBookings.findByEmail(email);

        if (existingBooking != null) {
            existingBooking.setName(updatedBooking.getName());
            existingBooking.setPhone(updatedBooking.getPhone());
            existingBooking.setEntryDate(updatedBooking.getEntryDate());
            existingBooking.setExitDate(updatedBooking.getExitDate());
            existingBooking.setComments(updatedBooking.getComments());

            try {
                return myBookings.save(existingBooking);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return null;
        }
    }

    public boolean deleteBooking(String email) {
        bookingModel existingBooking = myBookings.findByEmail(email);

        if (existingBooking != null) {
            try {
                myBookings.delete(existingBooking);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
    }


}
